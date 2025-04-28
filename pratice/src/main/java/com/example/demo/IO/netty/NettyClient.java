package com.example.demo.IO.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

public class NettyClient {

    private static final int HEADER_LENGTH = 4;
    private static final int MAX_FRAME_LENGTH = 1024 * 1024;

    public void sendMessage(String message) throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();

                            pipeline.addLast("frameDecoder",
                                    new LengthFieldBasedFrameDecoder(MAX_FRAME_LENGTH, 0, HEADER_LENGTH, 0, HEADER_LENGTH));
                            pipeline.addLast("frameEncoder", new LengthFieldPrepender(HEADER_LENGTH));

                            pipeline.addLast("decoder", new StringDecoder(CharsetUtil.UTF_8));
                            pipeline.addLast("encoder", new StringEncoder(CharsetUtil.UTF_8));

                            pipeline.addLast("handler", new ClientHandler());
                        }
                    });

            // 使用127.0.0.1连接本地服务器
            ChannelFuture f = b.connect("127.0.0.1", 1088).sync();

            Channel channel = f.channel();
            channel.writeAndFlush(message);
            System.out.println("<客户端>发送请求: " + message);

            channel.closeFuture().sync();
        } finally {
            group.shutdownGracefully();
        }
    }

    static class ClientHandler extends SimpleChannelInboundHandler<String> {
        @Override
        protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
            System.out.println("<客户端>收到响应内容: " + msg);
            ctx.close();
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
            cause.printStackTrace();
            ctx.close();
        }
    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                new NettyClient().sendMessage("客户发的测试请求！" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.example.demo.IO.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

public class NettyServer {

    private static final int HEADER_LENGTH = 4;
    private static final int MAX_FRAME_LENGTH = 1024 * 1024; // 最大帧长度

    public void bind(int port) throws Exception {
        // 配置服务端的NIO线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();

                            // 处理粘包/拆包
                            pipeline.addLast("frameDecoder",
                                    new LengthFieldBasedFrameDecoder(MAX_FRAME_LENGTH, 0, HEADER_LENGTH, 0, HEADER_LENGTH));
                            pipeline.addLast("frameEncoder", new LengthFieldPrepender(HEADER_LENGTH));

                            // 字符串编解码
                            pipeline.addLast("decoder", new StringDecoder(CharsetUtil.UTF_8));
                            pipeline.addLast("encoder", new StringEncoder(CharsetUtil.UTF_8));

                            // 业务处理器
                            pipeline.addLast("handler", new MessageHandler());
                        }
                    });

            // 绑定端口，同步等待成功
            ChannelFuture f = b.bind(port).sync();
            System.out.println("Netty server started on port: " + port);

            // 等待服务端监听端口关闭
            f.channel().closeFuture().sync();
        } finally {
            // 优雅退出，释放线程池资源
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    // 消息处理器
    static class MessageHandler extends SimpleChannelInboundHandler<String> {

        @Override
        protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
            // 接收客户端请求
            System.out.println("<服务端>收到内容=" + msg);

            // 给客户端发送回执
            String response = "服务端已收到";
            ByteBuf buf = ByteBufAllocator.DEFAULT.buffer();
            buf.writeInt(response.getBytes(CharsetUtil.UTF_8).length);
            buf.writeBytes(response.getBytes(CharsetUtil.UTF_8));
            ctx.writeAndFlush(buf);
            System.out.println("<服务端>发送回执,time=" + System.currentTimeMillis());
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
            cause.printStackTrace();
            ctx.close();
        }
    }

    public static void main(String[] args) {
        try {
            new NettyServer().bind(1088);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
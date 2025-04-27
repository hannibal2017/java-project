package com.example.demo.designPattern.adater;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 14:49
 * @Version 1.0
 * @Description 适配器模式
 **/
public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","光辉岁月.mp3");
        audioPlayer.play("vlc","光辉岁月.vlc");
        audioPlayer.play("mp4","光辉岁月.mp4");
        audioPlayer.play("flac","光辉岁月.flac");
        /**
         * 测试堆内存溢出，需配合设置VM参数，在idea选择增加VM option，参数：
         * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/Users/luoluo/myWorkStation/idea/gitee/springboot_demo/heapdump.hprof
         * 然后用mat软件分析
         */
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[1024 * 1024]);
        }
    }
}

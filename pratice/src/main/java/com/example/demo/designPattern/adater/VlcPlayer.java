package com.example.demo.designPattern.adater;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 14:35
 * @Version 1.0
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String type, String fileName) {
        System.out.println("playing vlc file : " + fileName);
    }

    @Override
    public void playMp4(String type, String fileName) {

    }
}

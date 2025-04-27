package com.example.demo.designPattern.adater;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 14:37
 * @Version 1.0
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String type, String fileName) {

    }

    @Override
    public void playMp4(String type, String fileName) {
        System.out.println("playing mp4 file : " + fileName);
    }
}

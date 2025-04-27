package com.example.demo.designPattern.adater;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 14:43
 * @Version 1.0
 **/
public class AudioPlayer implements MediaPlayer {

    MediaAdater mediaAdater;

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file : " + fileName);
        }else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            mediaAdater = new MediaAdater(type);
            mediaAdater.play(type, fileName);
        } else {
            System.out.println(type + " file not surpported :" + fileName);
        }
    }
}

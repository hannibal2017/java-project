package com.example.demo.designPattern.adater;

/**
 * @Author luozhenwu
 * @Date 2022/10/6 14:39
 * @Version 1.0
 **/
public class MediaAdater implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdater(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String fileName) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(type,fileName);
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(type,fileName);
        }
    }
}

package com.xin.design.structurepattern.adapterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: AdapterPatternDemo
 * @create: 2023-09-19 14:30
 **/
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alon.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "ming me.avi");
    }
}

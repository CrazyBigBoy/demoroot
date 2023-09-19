package com.xin.design.structurepattern.adapterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: AudioPlayer
 * @create: 2023-09-19 14:30
 **/
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println(audioType + " format not supported");
        }
    }
}

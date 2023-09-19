package com.xin.design.structurepattern.adapterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: Mp4Player
 * @create: 2023-09-19 14:38
 **/
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}

package com.xin.design.structurepattern.adapterpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: VlcPlayer
 * @create: 2023-09-19 14:37
 **/
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}

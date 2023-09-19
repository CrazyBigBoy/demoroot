package com.xin.design.behaviorpattern.templatepattern;

/**
 * @description: 足球游戏
 * @author: puxin
 * @version: 1.0
 * @ClassName: FootballGame
 * @create: 2023-09-07 09:34
 **/
public class FootballGame extends GameTemplete {

    @Override
    public void init(String name) {
        super.init(name);
    }

    @Override
    void start() {
        System.out.println("Football game start");
        System.out.println("Football game start");
    }

    @Override
    void run() {
        System.out.println("Football game running.......");
        System.out.println("Football game running.......");
    }

    @Override
    void end() {
        System.out.println("Football game end");
        System.out.println("Football game end");
    }
}

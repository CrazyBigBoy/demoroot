package com.xin.design.behaviorpattern.templatepattern;

/**
* @description: 足球游戏
 * @author: puxin
 * @version: 1.0
 * @ClassName: BasketballGame
 * @create: 2023-09-07 09:32
 **/
public class BasketballGame extends GameTemplete {

    /**
     * 游戏初始化
     */
    @Override
    public void init(String gamename) {
        super.init(gamename);
    }

    /**
     * 游戏开始
     */
    @Override
    void start() {
        System.out.println("Basketball game start");
    }

    /**
     * 游戏运行中
     */
    @Override
    void run() {
        System.out.println("Basketball game running..........");
    }

    /**
     * 游戏结束
     */
    @Override
    void end() {
        System.out.println("Basketball game end");
    }
}

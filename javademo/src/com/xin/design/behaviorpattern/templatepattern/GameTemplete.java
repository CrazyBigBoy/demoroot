package com.xin.design.behaviorpattern.templatepattern;

/**
 * @description: 游戏模版
 * @author: puxin
 * @version: 1.0
 * @ClassName: GameTemplete
 * @create: 2023-09-07 09:29
 **/
public abstract class GameTemplete {
    /**
     * 游戏初始化
     */
    public void init(String gamename){
        System.out.println(gamename+" game init......");
    }

    /**
     * 游戏开始
     */
    abstract void start();

    /**
     * 游戏运行
     */
    abstract void run();

    /**
     * 游戏结束
     */
    abstract void end();

    public void play(String gamename){
        init(gamename);

        start();

        run();

        end();
    }

}

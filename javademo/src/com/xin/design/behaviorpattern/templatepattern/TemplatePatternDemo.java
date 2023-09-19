package com.xin.design.behaviorpattern.templatepattern;

/**
 * @description: 设计模式测试
 * @author: puxin
 * @version: 1.0
 * @ClassName: TemplatePatternDemo
 * @create: 2023-09-07 09:36
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {
        GameTemplete basketballGame = new BasketballGame();
        basketballGame.play("Basketball");

        System.out.println("===========================");

        GameTemplete footballGame = new FootballGame();
        footballGame.play("Football");
    }
}

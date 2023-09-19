package com.xin.design.behaviorpattern.commandpattern;

/**
 * @description: 命令模式测试
 * @author: puxin
 * @version: 1.0
 * @ClassName: CommandPatternDemo
 * @create: 2023-09-07 10:07
 **/
public class CommandPatternDemo {
    public static void main(String[] args) {
        RemuteController remuteController = new RemuteController();
        Light light = new Light();
        remuteController.addOffCommand(new LightOffCommand(light));
        remuteController.addOnCommand(new LightOnCommand(light));

        remuteController.pushOnCommand(0);
        remuteController.pushOffCommand(0);
    }
}

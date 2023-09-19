package com.xin.design.behaviorpattern.commandpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: LightOnCommand
 * @create: 2023-09-07 10:12
 **/
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excete() {
        light.on();
    }
}

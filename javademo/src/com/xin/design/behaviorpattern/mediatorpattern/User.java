package com.xin.design.behaviorpattern.mediatorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: User
 * @create: 2023-09-15 14:56
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}

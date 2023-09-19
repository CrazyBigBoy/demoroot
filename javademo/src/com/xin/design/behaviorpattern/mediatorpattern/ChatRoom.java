package com.xin.design.behaviorpattern.mediatorpattern;

import java.util.Date;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: ChatRoom
 * @create: 2023-09-15 14:52
 **/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}

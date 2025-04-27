package com.example.demo.designPattern.mediator;

import java.util.Date;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 17:33
 * @Version 1.0
 **/

/**
 * 中介者类
 */
public class ChatRoom {
    public static void sendMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}

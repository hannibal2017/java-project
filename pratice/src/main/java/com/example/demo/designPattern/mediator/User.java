package com.example.demo.designPattern.mediator;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 17:33
 * @Version 1.0
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.sendMessage(this, message);
    }
}

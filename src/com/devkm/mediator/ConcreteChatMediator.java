/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAVEESH
 */
public class ConcreteChatMediator implements ChatMediator {
    private List<User> users;

    public ConcreteChatMediator() {
        this.users = new ArrayList<>();
    }

    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Send the message to all users except the sender
            if (u != user) {
                u.receive(message);
            }
        }
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
    


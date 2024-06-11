/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devkm.mediator;

/**
 *
 * @author KAVEESH
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

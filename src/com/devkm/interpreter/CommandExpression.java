/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.interpreter;

import com.devkm.model.Command;
import com.devkm.model.Ingredient;

/**
 *
 * @author KAVEESH
 */
public class CommandExpression implements Expression {

    private Command command;

    public CommandExpression(Command command) {
        this.command = command;
    }

    @Override
    public void interpret(Ingredient ingredient, String command) {
        if (command.equalsIgnoreCase(this.command.getClass().getSimpleName())) {
            this.command.interpret(ingredient);
        }
    }
}

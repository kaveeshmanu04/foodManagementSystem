/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.interpreter;

import com.devkm.model.Command;
import com.devkm.model.ExtraCheeseCommand;
import com.devkm.model.ExtraChickenCommand;

/**
 *
 * @author KAVEESH
 */
public class CommandParser {

    public static InterpreterContext buildParser() {
        InterpreterContext context = new InterpreterContext();

        // Define commands and add them to the context
        Command extraCheeseCommand = new ExtraCheeseCommand();
        Command extraChickenCommand = new ExtraChickenCommand();

        context.addExpression(new CommandExpression(extraCheeseCommand));
        context.addExpression(new CommandExpression(extraChickenCommand));

        return context;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.interpreter;

import com.devkm.model.Ingredient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KAVEESH
 */
public class InterpreterContext {

    private List<Expression> expressions;

    public InterpreterContext() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    public void interpret(Ingredient ingredient, String command) {
        for (Expression expression : expressions) {
            expression.interpret(ingredient, command);
        }
    }
}

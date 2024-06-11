/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devkm.interpreter;

import com.devkm.model.Ingredient;

/**
 *
 * @author KAVEESH
 */
public interface Expression {
    void interpret(Ingredient ingredient, String command);
}

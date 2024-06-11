/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.model;

/**
 *
 * @author KAVEESH
 */
public class ExtraChickenCommand implements Command {
    @Override
    public void interpret(Ingredient ingredient) {
        // Interpretation logic for adding extra chicken to the ingredient
        System.out.println("Adding extra chicken to " + ingredient.getName());
    }
}

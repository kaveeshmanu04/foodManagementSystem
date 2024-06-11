/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devkm.model;

/**
 *
 * @author KAVEESH
 */
public class BasicIngredient implements Ingredient {

    private final String name;

    public BasicIngredient(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


package com.devkm.model;

/**
 *
 * @author KAVEESH
 */
public class ExtraCheeseCommand implements Command {
    @Override
    public void interpret(Ingredient ingredient) {
        // Interpretation logic for adding extra cheese to the ingredient
        System.out.println("Adding extra cheese to " + ingredient.getName());
    }
}

package com.devkm.model;



import java.util.HashMap;
import java.util.Map;

public class IngredientFactory {

    private final Map<String, Ingredient> ingredientCache = new HashMap<>();

    public Ingredient getIngredient(String name) {
        if (!ingredientCache.containsKey(name)) {
            ingredientCache.put(name, new BasicIngredient(name));
        }
        return ingredientCache.get(name);
    }
}


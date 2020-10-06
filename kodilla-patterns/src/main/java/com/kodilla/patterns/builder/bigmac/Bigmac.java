package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final String burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BurgerBuilder {
        private String bun;
        private String burgers;
        private String sauce;
        private final List<String> ingredients = new ArrayList<>();

        public BurgerBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder burgers(String burgers){
            this.burgers = burgers;
            return this;
        }

        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
    private Bigmac(final String bun, final String burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

package org.jru.builder;

import org.jru.drink.Drink;
import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;

public class DrinkBuilder implements Builder{
    private Drink drink = new Drink();

    public DrinkBuilder drink(DrinkItem drinkItem) {
        drink.setDrinkItem(drinkItem);
        return this;
    }

    public DrinkBuilder additionalItem(DrinkAdditionalItem additionalItem) {
        drink.getDrinkAdditionalItem().add(additionalItem);
        return this;
    }

    public Drink build() {
        return build();
    }
}

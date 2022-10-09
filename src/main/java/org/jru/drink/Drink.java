package org.jru.drink;

import org.jru.item.Item;

import java.util.List;

public class Drink {
    private DrinkItem drinkItem;
    private List<Item> drinkAdditionalItem;

    public DrinkItem getDrinkItem() {
        return drinkItem;
    }

    public void setDrinkItem(DrinkItem drinkItem) {
        this.drinkItem = drinkItem;
    }

    public List<Item> getDrinkAdditionalItem() {
        return drinkAdditionalItem;
    }

    public void setDrinkAdditionalItem(List<Item> drinkAdditionalItem) {
        this.drinkAdditionalItem = drinkAdditionalItem;
    }
}

package org.jru.drink;

import org.jru.item.Item;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private DrinkItem drinkItem;
    private List<DrinkAdditionalItem> drinkAdditionalItem;

    public Drink() {
        drinkAdditionalItem = new ArrayList<>();
    }

    public DrinkItem getDrinkItem() {
        return drinkItem;
    }

    public void setDrinkItem(DrinkItem drinkItem) {
        this.drinkItem = drinkItem;
    }

    public List<DrinkAdditionalItem> getDrinkAdditionalItem() {
        return drinkAdditionalItem;
    }
}

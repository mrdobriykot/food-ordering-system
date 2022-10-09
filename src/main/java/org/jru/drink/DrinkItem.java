package org.jru.drink;

import org.jru.item.PaidItem;

public enum DrinkItem implements PaidItem {
    PEPSI(5F),
    COLA(6F),
    SPRITE(7F);


    private final Float price;

    DrinkItem(Float price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Float getPrice() {
        return null;
    }
}

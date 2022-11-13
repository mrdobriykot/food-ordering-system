package org.jru.drink;

import org.jru.item.Item;

public enum DrinkAdditionalItem implements Item {
    ICE_CUBES("Ice Cubes"),
    LEMON("Lemon");

    private String name;
    DrinkAdditionalItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

package org.jru.drink;

import org.jru.item.Item;

public enum DrinkAdditionalItem implements Item {
    ICE_CUBES("Кубики льда"),
    LEMON("Лимон");

    private String name;
    DrinkAdditionalItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name();
    }
}

package org.jru.drink;

import org.jru.item.Item;

public enum DrinkAdditionalItem implements Item {
    ICE_CUBES,
    LEMON;


    @Override
    public String getName() {
        return name();
    }
}

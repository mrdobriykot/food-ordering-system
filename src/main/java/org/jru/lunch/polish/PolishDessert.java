package org.jru.lunch.polish;

import org.jru.item.DessertItem;

public enum PolishDessert implements DessertItem {
    ;

    @Override
    public String getName() {
        return name();
    }

    @Override
    public Float getPrice() {
        return null;
    }
}

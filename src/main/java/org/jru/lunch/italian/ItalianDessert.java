package org.jru.lunch.italian;

import org.jru.item.DessertItem;

public enum ItalianDessert implements DessertItem {
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

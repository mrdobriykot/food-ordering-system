package org.jru.lunch.polish;

import org.jru.item.DessertItem;

public enum PolishDessert implements DessertItem {
    BABKA(7F),
    MAZURKA(8F),
    FAWORKI(5F);

    private final Float price;

    PolishDessert(Float price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name();
    }

    @Override
    public Float getPrice() {
        return price;
    }
}

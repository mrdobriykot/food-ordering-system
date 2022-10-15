package org.jru.lunch.mexican;

import org.jru.item.DessertItem;

public enum MexicanDessert implements DessertItem {
    CHURROS(13F),
    ORCHATA(10F),
    MANGONADA(9F);

    private final Float price;

    MexicanDessert(Float price) {
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

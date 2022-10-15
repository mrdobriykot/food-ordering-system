package org.jru.lunch.italian;

import org.jru.item.DessertItem;

public enum ItalianDessert implements DessertItem {
    DZHELATTO(18F),
    AMARETTI(16F),
    KARPEZE(12F);


    private final Float price;

    ItalianDessert(Float price) {
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

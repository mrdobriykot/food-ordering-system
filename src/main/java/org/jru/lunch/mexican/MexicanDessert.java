package org.jru.lunch.mexican;

import org.jru.item.DessertItem;

public enum MexicanDessert implements DessertItem {
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

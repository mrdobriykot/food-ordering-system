package org.jru.lunch.polish;

import org.jru.item.CourseItem;

public enum PolishCourse implements CourseItem {
    PAPRIKASH(10F),
    ZRAZY(7F),
    RULKA(8F);


    private final Float price;

    PolishCourse(Float price) {
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

package org.jru.lunch.mexican;

import org.jru.item.CourseItem;


public enum MexicanCourse implements CourseItem {
    TAKO(3F),
    ENCHILADA(5F),
    BURRITO(6F);

    private final Float price;

    MexicanCourse(Float price) {
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

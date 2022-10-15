package org.jru.lunch.italian;

import org.jru.item.CourseItem;

public enum ItalianCourse implements CourseItem {
    PIZZA(15F),
    PASTA(4F),
    PIZZONI(8F);

    private final Float price;

    ItalianCourse(Float price) {
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

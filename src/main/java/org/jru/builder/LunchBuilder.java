package org.jru.builder;

import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.lunch.Lunch;

public class LunchBuilder implements Builder{
    private Lunch lunch = new Lunch();

    public LunchBuilder course(CourseItem courseItem) {
        lunch.setCourse(courseItem);
        return this;
    }

    public LunchBuilder dessert(DessertItem dessertItem) {
        lunch.setDessert(dessertItem);
        return this;
    }

    public Lunch build() {
        return lunch;
    }
}

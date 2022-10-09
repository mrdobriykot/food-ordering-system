package org.jru.lunch;

import org.jru.item.CourseItem;
import org.jru.item.DessertItem;

public class Lunch {
    private CourseItem course;
    private DessertItem dessert;

    public CourseItem getCourse() {
        return course;
    }

    public void setCourse(CourseItem course) {
        this.course = course;
    }

    public DessertItem getDessert() {
        return dessert;
    }

    public void setDessert(DessertItem dessert) {
        this.dessert = dessert;
    }
}

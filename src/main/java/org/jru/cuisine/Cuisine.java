package org.jru.cuisine;

import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.item.PaidItem;

import java.util.List;

public abstract class Cuisine {
    private List<CourseItem> courses;
    private List<DessertItem> desserts;

    private final String name;

    protected Cuisine(List<CourseItem> courses, List<DessertItem> desserts, String name) {
        this.courses = courses;
        this.desserts = desserts;
        this.name = name;
    }

    public List<CourseItem> getCourses() {
        return courses;
    }

    public List<DessertItem> getDeserts() {
        return desserts;
    }

    public String getName() {
        return name;
    }
}

package org.jru.lunch.italian;

import org.jru.item.CourseItem;

public enum ItalianCourse implements CourseItem {
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

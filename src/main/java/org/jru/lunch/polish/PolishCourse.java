package org.jru.lunch.polish;

import org.jru.item.CourseItem;

public enum PolishCourse implements CourseItem {
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

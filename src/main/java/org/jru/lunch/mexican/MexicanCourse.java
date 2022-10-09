package org.jru.lunch.mexican;

import org.jru.item.CourseItem;


public enum MexicanCourse implements CourseItem {
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

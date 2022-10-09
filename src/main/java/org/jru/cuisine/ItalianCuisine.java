package org.jru.cuisine;

import org.jru.lunch.italian.ItalianCourse;
import org.jru.lunch.italian.ItalianDessert;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ItalianCuisine extends Cuisine{
    public ItalianCuisine() {
        super(Stream.of(ItalianCourse.values()).collect(Collectors.toList()),
                Stream.of(ItalianDessert.values()).collect(Collectors.toList()),
                "Italian cuisine");
    }
}

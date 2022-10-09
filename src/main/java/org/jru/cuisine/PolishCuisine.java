package org.jru.cuisine;

import org.jru.lunch.polish.PolishCourse;
import org.jru.lunch.polish.PolishDessert;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PolishCuisine extends Cuisine{
    public PolishCuisine() {
        super(Stream.of(PolishCourse.values()).collect(Collectors.toList()),
                Stream.of(PolishDessert.values()).collect(Collectors.toList()),
                "Polish cuisine");
    }
}

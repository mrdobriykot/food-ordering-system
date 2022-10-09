package org.jru.cuisine;

import org.jru.lunch.mexican.MexicanCourse;
import org.jru.lunch.mexican.MexicanDessert;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MexicanCuisine extends Cuisine{
    public MexicanCuisine() {
        super(Stream.of(MexicanCourse.values()).collect(Collectors.toList()),
                Stream.of(MexicanDessert.values()).collect(Collectors.toList()),
                "Mexican cuisine");
    }
}

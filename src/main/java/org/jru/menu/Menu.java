package org.jru.menu;

import org.jru.cuisine.Cuisine;
import org.jru.cuisine.ItalianCuisine;
import org.jru.cuisine.MexicanCuisine;
import org.jru.cuisine.PolishCuisine;
import org.jru.drink.Drink;
import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Menu {
    private Cuisine italianCuisine;
    private Cuisine polishCuisine;
    private Cuisine mexicanCuisine;
    private List<DrinkItem> drinks;
    private List<DrinkAdditionalItem> drinkAdditionalItems;
    private List <Cuisine> cuisines;

    public Menu() {
        italianCuisine = new ItalianCuisine();
        polishCuisine = new PolishCuisine();
        mexicanCuisine = new MexicanCuisine();
        cuisines = List.of(italianCuisine, polishCuisine, mexicanCuisine);
        drinks = Stream.of(DrinkItem.values()).collect(Collectors.toList());
        drinkAdditionalItems = Stream.of(DrinkAdditionalItem.values()).collect(Collectors.toList());
    }

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public Cuisine getItalianCuisine() {
        return italianCuisine;
    }

    public Cuisine getPolishCuisine() {
        return polishCuisine;
    }

    public Cuisine getMexicanCuisine() {
        return mexicanCuisine;
    }

    public List<DrinkItem> getDrinks() {
        return drinks;
    }

    public List<DrinkAdditionalItem> getDrinkAdditionalItems() {
        return drinkAdditionalItems;
    }
}

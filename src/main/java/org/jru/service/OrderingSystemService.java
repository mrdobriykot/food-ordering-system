package org.jru.service;


import org.jru.View;
import org.jru.builder.DrinkBuilder;
import org.jru.builder.LunchBuilder;
import org.jru.builder.OrderBuilder;
import org.jru.cuisine.Cuisine;
import org.jru.drink.Drink;
import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;
import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.lunch.Lunch;
import org.jru.menu.Menu;
import org.jru.order.Order;

import java.util.ArrayList;
import java.util.List;


public class OrderingSystemService {
    private View view = new View();
    private Menu menu;
    private Order order;



    public void makeOrder() {
        Cuisine cuisine = chooseCuisine();
        Lunch lunch = cuisine == null ? null : chooseLunch(cuisine);
        Drink drink = chooseDrink();
        order = new OrderBuilder().lunch(lunch).drink(drink).build();
    }

    private Cuisine chooseCuisine() {
        view.printCuisines();
        int cuisineCount = view.getCuisineIndex();
        return cuisineCount == 0 ? null : menu.getCuisines().get(cuisineCount - 1);
    }

    private Lunch chooseLunch(Cuisine cuisine) {
        CourseItem courseItem = chooseCourse(cuisine);
        DessertItem dessertItem = chooseDessert(cuisine);
        return new LunchBuilder().course(courseItem).dessert(dessertItem).build();
    }

    private CourseItem chooseCourse(Cuisine cuisine) {
        List<CourseItem> courses = cuisine.getCourses();
        int courseId = view.getCourseId(courses);
        return courses.get(courseId -1);
    }

    private DessertItem chooseDessert(Cuisine cuisine) {
        List<DessertItem> desserts = cuisine.getDeserts();
        int dessertId = view.getDessertId(desserts);
        return  desserts.get(dessertId -1);
    }

    private Drink chooseDrink() {
        DrinkItem drinkItem = chooseDrinkItem();
        if (drinkItem != null) {
            List<DrinkAdditionalItem> additionalItem = chooseAdditionalItem();
            DrinkBuilder drinkBuilder = new DrinkBuilder().drink(drinkItem);
            if (!additionalItem.isEmpty()) {
                for (DrinkAdditionalItem item : additionalItem) {
                    drinkBuilder.additionalItem(item);
                }
            }
            return drinkBuilder.build();
        }
        return null;
    }

    private DrinkItem chooseDrinkItem() {
        List<DrinkItem> drinks = menu.getDrinks();
        int drinkIndex = view.getDrinkId(drinks);
        return drinkIndex == 0 ? null : drinks.get(drinkIndex - 1);
    }

    private List<DrinkAdditionalItem> chooseAdditionalItem() {
        List<DrinkAdditionalItem> drinkAdditionalItems = menu.getDrinkAdditionalItems();
        List<DrinkAdditionalItem> resultItem = new ArrayList<>();
        while (true){
            int index = view.getIdAdditionalItem(drinkAdditionalItems);
            if (index == 0){
                break;
            }else if (!resultItem.contains(drinkAdditionalItems.get(index -1))){
                resultItem.add(drinkAdditionalItems.get(index -1));
            }
        }
        return resultItem;
    }

}

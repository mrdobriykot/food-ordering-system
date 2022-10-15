package org.jru.service;


import org.jru.View;
import org.jru.builder.DrinkBuilder;
import org.jru.builder.LunchBuilder;
import org.jru.builder.OrderBuilder;
import org.jru.cuisine.Cuisine;
import org.jru.cuisine.ItalianCuisine;
import org.jru.drink.Drink;
import org.jru.drink.DrinkAdditionalItem;
import org.jru.drink.DrinkItem;
import org.jru.item.CourseItem;
import org.jru.item.DessertItem;
import org.jru.item.Item;
import org.jru.lunch.Lunch;
import org.jru.lunch.italian.ItalianCourse;
import org.jru.lunch.italian.ItalianDessert;
import org.jru.order.Order;

import java.util.Scanner;

public class OrderingSystemService {
    private View view = new View();
    private Order order;
    private Lunch lunch;
    private Cuisine cuisine = new ItalianCuisine();


    public void menuNavigation() {
        int choose = view.displayMenu();
        switch (choose) {
            case 1: {
                int cuisineChoose = view.displayCuisineMenu();
                if (cuisineChoose == 1) {
                    orderItalianCuisine();
                }
                if (cuisineChoose == 2) {
                    orderItalianCuisine();
                }
                if (cuisineChoose == 3) {
                    orderItalianCuisine();
                }
                break;
            }
            case 2: {
                createOrderDrink(createDrink(view.displayDrinkMenu()));
                break;
            }

            case  3: {
                italianCuisineWithDrink();
                break;
            }
        }

    }

    private void orderItalianCuisine() {
        createOrder(createLunch(view.italianDisplayMenu(), view.italianDisplayDessertMenu()));
    }

    private void italianCuisineWithDrink() {
        createOrderWithDrink(createLunch(view.italianDisplayMenu(), view.italianDisplayDessertMenu()),
                createDrink(view.displayDrinkMenu()));
    }

    private void createOrderDrink(Drink drink) {
        order = new OrderBuilder().drink(drink).build();
        System.out.println("Your order are: " + drink.getDrinkItem());
    }

    private void createOrder(Lunch lunch) {
        order = new OrderBuilder().lunch(lunch).build();
        System.out.println("Your order are: " + lunch.getCourse() + " " + lunch.getDessert());
    }
    private void createOrderWithDrink(Lunch lunch, Drink drink) {
        order = new OrderBuilder().lunch(lunch).drink(drink).build();
        System.out.println("Your order are: " + lunch.getCourse() + " " + lunch.getDessert() + " " + drink.getDrinkItem());
    }

    private Lunch createLunch(CourseItem courseItem, DessertItem dessertItem) {
        Lunch lunch = new LunchBuilder().course(courseItem).dessert(dessertItem).build();
        return lunch;
    }

    private Drink createDrink(DrinkItem drinkItem){
        Drink drink = new DrinkBuilder().drink(drinkItem).build();
        return drink;
    }

    private Drink createDrinkWithAdditionalElem(DrinkItem drinkItem, DrinkAdditionalItem drinkAdditionalItem){
        Drink drink = new DrinkBuilder().drink(drinkItem).additionalItem(drinkAdditionalItem).build();
        return drink;
    }

}

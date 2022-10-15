package org.jru.service;


import org.jru.View;
import org.jru.builder.LunchBuilder;
import org.jru.builder.OrderBuilder;
import org.jru.cuisine.Cuisine;
import org.jru.cuisine.ItalianCuisine;
import org.jru.drink.Drink;
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
                    italianCuisine();
                }
                if (cuisineChoose == 2) {
                    italianCuisine();
                }
                if (cuisineChoose == 3) {
                    italianCuisine();
                }
                break;
            }
            case 2: {

            }
        }

    }

    private void italianCuisine() {
        view.italianDisplayMenu();
        view.displayDrinkMenu();

    }




    public void CreateOrder(Lunch lunch, Drink drink) {
        order = new OrderBuilder().lunch(lunch).drink(drink).build();

    }

    private Lunch CreateLunch(CourseItem courseItem) {
        Lunch lunch = new LunchBuilder().course(courseItem).build();
        return lunch;
    }

}

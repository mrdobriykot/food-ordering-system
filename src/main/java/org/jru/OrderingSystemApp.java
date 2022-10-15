package org.jru;

import org.jru.service.OrderingSystemService;

import java.util.Arrays;

public class OrderingSystemApp {
    public static void main(String[] args) {
        OrderingSystemService service = new OrderingSystemService();
        service.menuNavigation();
//        Lunch lunch = new LunchBuilder().course(ItalianCourse.PIZZA).dessert(ItalianDessert.KARPEZE).build();
//        Drink drink = new DrinkBuilder().drink(DrinkItem.SPRITE)
//                .additionalItem(DrinkAdditionalItem.LEMON)
//                .build();
//        Order order = new OrderBuilder().lunch(lunch).drink(drink).build();
//        System.out.println(order.getLunch().getDessert().getPrice());
    }
}

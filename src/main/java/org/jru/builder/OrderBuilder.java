package org.jru.builder;

import org.jru.drink.Drink;
import org.jru.lunch.Lunch;
import org.jru.order.Order;

public class OrderBuilder implements Builder{
    private Order order = new Order();

    public OrderBuilder lunch(Lunch lunch) {
        order.setLunch(lunch);
        return this;
    }

    public OrderBuilder drink(Drink drink) {
        order.setDrink(drink);
        return this;
    }

    public Order build() {
        return order;
    }
}

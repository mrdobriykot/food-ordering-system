package org.jru.order;

import org.jru.drink.Drink;
import org.jru.lunch.Lunch;

public class Order {
    private Lunch lunch;
    private Drink drink;

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}

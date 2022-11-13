package org.jru;

import org.jru.service.OrderingSystemService;

public class OrderingSystemApp {
    public static void main(String[] args) {
        View view = new View();
        OrderingSystemService service = new OrderingSystemService();
        view.showMenu();
        service.makeOrder();
    }
}

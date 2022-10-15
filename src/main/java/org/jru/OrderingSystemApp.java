package org.jru;

import org.jru.service.OrderingSystemService;

public class OrderingSystemApp {
    public static void main(String[] args) {
        OrderingSystemService service = new OrderingSystemService();
        service.menuNavigation();
    }
}

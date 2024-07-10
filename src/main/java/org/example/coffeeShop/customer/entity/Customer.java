package org.example.coffeeShop.customer.entity;

import org.example.coffeeShop.order.entity.Cashier;
import org.example.coffeeShop.order.service.OrderService;

public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void orderCoffee(OrderService orderService) {
        System.out.println(name + "이(가) 커피를 주문한다.");
        orderService.takeOrder();
    }

    public String getName() {
        return name;
    }
}

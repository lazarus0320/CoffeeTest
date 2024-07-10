package org.example.coffeeShop.order.entity;

import org.example.coffeeShop.brew.entity.Barista;
import org.example.coffeeShop.order.service.OrderService;

public class Cashier implements OrderService {
    private final String name;
    private final Barista barista;

    public Cashier(String name, Barista barista) {
        this.name = name;
        this.barista = barista;
    }

    @Override
    public void takeOrder() {
        System.out.println(name + "이(가) 커피 주문을 받았다.");
        barista.makeCoffee();
    }

    public String getName() {
        return name;
    }
}

package org.example.coffeeShop.brew.entity;

import org.example.coffeeShop.brew.service.BrewService;

public class Barista implements BrewService {
    private final String name;

    public Barista(String name) {
        this.name =name;
    }

    public void makeCoffee() {
        System.out.println(name + "이(가) 커피를 제조한다.");
    }

    public String getName() {
        return name;
    }
}

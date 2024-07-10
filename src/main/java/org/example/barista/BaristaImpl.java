package org.example.barista;

import org.example.coffee.Coffee;

public class BaristaImpl implements Barista {
    public BaristaImpl() {
    }

    @Override
    public Coffee makeCoffee() {
        return new Coffee("Latte");
    }
}

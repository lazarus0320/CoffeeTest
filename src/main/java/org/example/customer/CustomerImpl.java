package org.example.customer;

import org.example.barista.BaristaImpl;
import org.example.cashier.Cashier;
import org.example.coffee.Coffee;

public class CustomerImpl implements  Customer {
    public CustomerImpl() {
    }

    @Override
    public void order(Cashier cashier) {
        Coffee coffee = cashier.getCoffee(new BaristaImpl());
    }
}

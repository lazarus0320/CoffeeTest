package org.example.cashier;

import org.example.barista.Barista;
import org.example.coffee.Coffee;

public class CashierImpl implements Cashier {
    public CashierImpl() {
    }

    @Override
    public Coffee getCoffee(Barista barista) {
        return barista.makeCoffee();
    }
}

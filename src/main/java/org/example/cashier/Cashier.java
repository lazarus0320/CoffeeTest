package org.example.cashier;

import org.example.barista.Barista;
import org.example.coffee.Coffee;

public interface Cashier {
    Coffee getCoffee(Barista barista);
}

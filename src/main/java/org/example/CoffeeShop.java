package org.example;

import org.example.barista.Barista;
import org.example.barista.BaristaImpl;
import org.example.cashier.Cashier;
import org.example.cashier.CashierImpl;
import org.example.customer.Customer;
import org.example.customer.CustomerImpl;

public class CoffeeShop {
    public static void main(String[] args) {
        Barista barista = new BaristaImpl();
        Cashier cashier = new CashierImpl();
        Customer customer = new CustomerImpl();

        customer.order(cashier);
    }
}
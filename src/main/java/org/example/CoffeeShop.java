package org.example;

import org.example.coffeeShop.brew.entity.Barista;
import org.example.coffeeShop.customer.entity.Customer;
import org.example.coffeeShop.order.entity.Cashier;

public class CoffeeShop {
    public static void main(String[] args) {
        Barista barista = new Barista("바리스타");
        Cashier cashier = new Cashier("캐셔", barista);
        Customer customer = new Customer("손님");

        customer.orderCoffee(cashier);
    }
}
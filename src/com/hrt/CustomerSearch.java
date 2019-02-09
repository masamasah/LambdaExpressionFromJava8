package com.hrt;

import java.util.List;

public class CustomerSearch {

    public static void main(String[] args) {

        List<Customer> customers = Customer.listCustomers();

        if (args.length > 0) {
            switch (args[0]) {
                case "filter":
                    customers.stream().filter(c -> c.getAge() > 29)
                            .filter(c -> c.getAge() < 40)
                            .forEach(CustmerPrinter::printNameAndAge);
                    break;
                case "sorted":
                    customers.stream()
                            .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
                            .forEach(c -> System.out.println(c.getName()));
            }
        } else {
            customers.forEach(CustmerPrinter::printCustomer);
        }
    }
}

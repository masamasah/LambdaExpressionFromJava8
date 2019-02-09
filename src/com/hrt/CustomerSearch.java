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
            }
        } else {
            customers.forEach(CustmerPrinter::printCustomer);
        }
    }
}

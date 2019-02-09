package com.hrt;

import java.util.List;

public class CustomerSearch {

    public static void main(String[] args) {

        List<Customer> customers = Customer.listCustomers();

        if (args.length > 0) {
        } else {
            customers.forEach(CustmerPrinter::printCustomer);
        }
    }
}

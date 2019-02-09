package com.hrt;

import java.util.List;
import java.util.stream.Collectors;

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
                    break;
                case "collect":
                    List<Customer> men = customers.stream().filter(c -> c.getGender() == Gender.MAN)
                            .collect(Collectors.toList());

                    List<Customer> women = customers.stream().filter(c -> c.getGender() == Gender.WOMAN)
                            .collect(Collectors.toList());

                    System.out.println("女性一覧");
                    women.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
                            .forEach((c) -> System.out.println(c.getName()));

                    System.out.println("男性一覧");
                    men.stream().sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
                            .forEach((c) -> System.out.println(c.getName()));
                    break;
            }
        } else {
            customers.forEach(CustmerPrinter::printCustomer);
        }
    }
}
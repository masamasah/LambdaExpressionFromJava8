package com.hrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SimpleStringSort {
    public static void main(String[] args) {
        String[] cities = {"Tokyo", "Novosibirsk", "Rome", "Beijing", "Johannesburg"};

        ArrayList<String> cityList = new ArrayList<>(Arrays.asList(cities));

        Comparator<String> c = (s1, s2) -> s1.compareTo(s2);

        if (args.length > 0) {
            switch (args[0]){
                case "c1":
                    c = (s1, s2) -> s2.compareTo(s1);
                    break;
                case "c2":
                    c = (s1, s2) -> s1.length() - s2.length();
                    break;
                default:
                    break;
            }
        }

        Collections.sort(cityList, c);

        for(String city: cityList){
            System.out.print(city + ", ");
        }


    }
}

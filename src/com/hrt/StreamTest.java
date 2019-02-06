package com.hrt;

import java.util.Iterator;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<HistoryPerson> people = HistoryPerson.listPeople();

        if (args.length > 0) {
            switch (args[0]) {
                case "veryold":
                    System.out.println("とても古い書き方");

                    Iterator<HistoryPerson> it = people.iterator();

                    while (it.hasNext()) {
                        HistoryPerson p = it.next();
                        System.out.println(p.getName());
                    }
                    break;
                case "foreach":
                default:
                    System.out.println("forEachを用いると");
                    people.forEach((p) -> System.out.println(p.getName()));
            }
        } else {
            for (HistoryPerson p : people) {
                System.out.println(p.getName());
            }
        }
    }
}

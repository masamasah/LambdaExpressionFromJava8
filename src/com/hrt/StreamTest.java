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
                    System.out.println("forEachを用いると");
                    people.forEach((p) -> System.out.println(p.getName()));
                    break;
                case "isborn":
                    System.out.println("1540年に生まれていた人は");
                    people.stream().filter((p) -> p.getBornYear() < 1540).forEach((p) -> System.out.println(p.getName()));
                    break;
                case "active":
                    System.out.println("1575年に健在だった人は");
                    people.stream().filter((p) -> p.getBornYear() < 1575)
                            .filter((p) -> p.getDeadYear() > 1575).forEach((p) -> System.out.println(p.getName()));
                    break;
                default:

            }
        } else {
            for (HistoryPerson p : people) {
                System.out.println(p.getName());
            }
        }
    }
}

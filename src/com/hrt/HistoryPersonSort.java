package com.hrt;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HistoryPersonSort {

    @FunctionalInterface
    interface Description {
        public String getString(HistoryPerson p);
    }

    public static void main(String[] args) {
        List<HistoryPerson> people = HistoryPerson.listPeople();

        Comparator<HistoryPerson> c = (p1, p2) -> p1.getYomi().compareTo(p2.getYomi());
        Description d = (p) -> p.describePerson();

        if (args.length > 0) {
            switch (args[0]) {
                case "castle":
                    c = (p1, p2) -> new Double(p1.getCastleLatitude()).compareTo(
                            new Double(p2.getCastleLatitude())
                    );
                    d = (p) -> p.describeCastle();
                    break;
                case "age":
                    c = (p1, p2) -> p1.getBornYear() - p2.getBornYear();
                    d = (p) -> p.describeAge(1560);
                    break;
                default:
                    break;
            }
        }
        Collections.sort(people, c);
        for(HistoryPerson p: people){
            System.out.println(d.getString(p));
        }
    }
}

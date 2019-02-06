package com.hrt.hrt_2;

import com.hrt.HistoryPerson;

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

        HistoryPersonDescriber okhzmDesciver = new HistoryPersonDescriber(1560);

        Comparator<HistoryPerson> c = HistoryPersonCompareProvider::compareByName;
        Description d = HistoryPersonDescriber::describePerson;
        if (args.length > 0) {
            switch (args[0]) {
                case "castle":
                    c = HistoryPersonCompareProvider::compareByLatitude;
                    d = HistoryPerson::describeCastle;
                    break;
                case "age":
                    c = (p1, p2) -> HistoryPersonCompareProvider.compareByBornYear(p1, p2);
                    d = okhzmDesciver::describeAge;
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

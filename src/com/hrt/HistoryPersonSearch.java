package com.hrt;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HistoryPersonSearch {

    public static void main(String[] args) {
        List<HistoryPerson> people = HistoryPerson.listPeople();

        if (args.length > 0) {
            int argYear = Integer.parseInt(args[0]);

            Predicate<HistoryPerson> isborn = (person) -> person.getBornYear() < argYear;
            Predicate<HistoryPerson> notdead = (person) -> person.getDeadYear() > argYear;

            Consumer<HistoryPerson> write = (p) -> System.out.println(p.getName()+"は"+(argYear-p.getBornYear()+"歳でした"));

            System.out.println(argYear+"年には");

            for(HistoryPerson p: people){
                if(isborn.and(notdead).test(p)){
                    write.accept(p);
                }
            }

        } else {
            Predicate<HistoryPerson> okehazama = (person) -> person.getBornYear() < 1560;
            for (HistoryPerson p : people) {
                if (okehazama.test(p)) {
                    System.out.println(p.getName() + "は" + (1560 - p.getBornYear()) + "でした");
                }
            }
        }
    }
}

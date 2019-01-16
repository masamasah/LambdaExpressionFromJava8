package com.hrt;

import java.util.List;
import java.util.function.Predicate;

public class HistoryPersonSearch {

    public static void main(String[] args) {
        List<HistoryPerson> people = HistoryPerson.listPeople();

        if (args.length > 0) {
            // TODO: implement
        } else {
            Predicate<HistoryPerson> okehazama = (person) -> person.getBornYear() < 1560;
            for(HistoryPerson p: people){
                if(okehazama.test(p)){
                    System.out.println(p.getName()+"は"+(1560-p.getBornYear())+"でした");
                }
            }
        }
    }
}

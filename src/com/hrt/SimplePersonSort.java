package com.hrt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimplePersonSort {
    public static void main(String[] args){
        List<SimplePerson> people = SimplePerson.listPeople();

        Comparator<SimplePerson> c = (p1, p2) -> p1.getYomi().compareTo(p2.getYomi());

        if(args.length > 0 && args[0].equals("kanji")){
            c = (p1, p2) -> p1.getName().compareTo(p2.getName());
        }

        Collections.sort(people, c);

        for(SimplePerson p: people){
            System.out.println(p.getName());
        }
    }
}

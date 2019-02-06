package com.hrt;

import java.util.List;

public class StreamTest {
    public static void main(String[] args){
        List<HistoryPerson> people = HistoryPerson.listPeople();

        if(args.length > 0){

        }
        else
        {
            for(HistoryPerson p: people){
                System.out.println(p.getName());
            }
        }
    }
}

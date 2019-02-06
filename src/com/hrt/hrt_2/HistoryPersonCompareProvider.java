package com.hrt.hrt_2;

import com.hrt.HistoryPerson;

public class HistoryPersonCompareProvider {

    public static int compareByName(HistoryPerson h1, HistoryPerson h2){
        return h1.getYomi().compareTo(h2.getYomi());
    }

    public static int compareByLatitude(HistoryPerson h1, HistoryPerson h2){
        return new Double(h2.getCastleLatitude()).compareTo(new Double(h1.getCastleLatitude()));
    }

    public static int compareByBornYear(HistoryPerson h1, HistoryPerson h2){
        return h1.getBornYear() - h2.getBornYear();
    }

}

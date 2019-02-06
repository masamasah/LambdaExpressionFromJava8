package com.hrt.hrt_2;

import com.hrt.HistoryPerson;

public class HistoryPersonDescriber {
    public int compareYear;

    public HistoryPersonDescriber(int year){
        this.compareYear = year;
    }

    public static String describePerson(HistoryPerson h){
        return h.getName() + " " + h.getBornYear() + "-" + h.getDeadYear();
    }

    public static String describeCastle(HistoryPerson h){
        return h.getName() + "が居城とした" + h.getCastleName();
    }

    public String describeAge(HistoryPerson h){
        String description = h.getName() + "は";

        if (this.compareYear < h.getBornYear()) {
            description += "まだ生まれていませんでした";
        } else if (this.compareYear > h.getDeadYear()) {
            description += "もうこの世にいませんでした";
        } else {
            description += this.compareYear - h.getBornYear() + "歳でした";
        }

        return description;
    }
}

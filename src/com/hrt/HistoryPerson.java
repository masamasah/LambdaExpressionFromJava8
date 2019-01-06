package com.hrt;


import java.util.ArrayList;
import java.util.List;

public class HistoryPerson {
    public HistoryPerson() {
        this.name = new HistoryPerson.Name();
        this.life = new HistoryPerson.Life();
        this.castle = new HistoryPerson.Castle();
    }

    HistoryPerson createName(String kanji, String yomi) {
        this.name.create(kanji, yomi);
        return this;
    }

    HistoryPerson createLife(int bornYear, int deadYear) {
        this.life.create(bornYear, deadYear);
        return this;
    }

    HistoryPerson createCastle(String name, double latitude, double longitude) {
        this.castle.create(name, latitude, longitude);
        return this;
    }


    private class Name {
        private String kanji;
        private String yomi;

        private void create(String kanji, String yomi) {
            this.kanji = kanji;
            this.yomi = yomi;
        }
    }

    private class Life {
        private int bornYear = 0;
        private int deadYear = 0;

        private void create(int bornYear, int deadYear) {
            this.bornYear = bornYear;
            this.deadYear = deadYear;
        }
    }

    private class Castle {
        private String name;
        private double latitude;
        private double longitude;

        private void create(String name, double latitude, double longtitude) {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longtitude;
        }
    }

    private Name name;
    private Life life;
    private Castle castle;

    public String getName() {
        return this.name.kanji;
    }

    public String getYomi() {
        return this.name.yomi;
    }

    public int getBornYear() {
        return this.life.bornYear;
    }

    public int getDeadYear() {
        return this.life.deadYear;
    }

    public String getCastleName() {
        return this.castle.name;
    }

    public double getCastleLatitude() {
        return this.castle.latitude;
    }

    public double getCastleLongitude() {
        return this.castle.longitude;
    }

    public String describePerson() {
        return this.getName() + " " + this.getBornYear() + "-" + this.getDeadYear();
    }

    public String describeCastle() {
        return this.getName() + "が居城とした" + this.getCastleName();
    }

    public String describeAge(int year) {
        String description = this.getName() + "は";

        if (year < this.getBornYear()) {
            description += "まだ生まれていませんでした";
        } else if (year > this.getDeadYear()) {
            description += "もうこの世にいませんでした";
        } else {
            description += year - this.getBornYear() + "歳でした";
        }

        return description;
    }

    public static List<HistoryPerson> listPeople() {
        List<HistoryPerson> people = new ArrayList<HistoryPerson>();

        people.add(new HistoryPerson()
                .createName("武田信玄", "たけだしんげん")
                .createLife(1521, 1573)
                .createCastle("躑躅ヶ崎館", 35.414171, 138.343898));

        people.add(new HistoryPerson()
                .createName("上杉謙信", "うえすぎけんしん")
                .createLife(1530, 1578)
                .createCastle("春日山城", 37.084808, 138.121999));

        people.add(new HistoryPerson()
                .createName("織田信長", "おだのぶなが")
                .createLife(1534, 1582)
                .createCastle("安土城", 35.092129, 136.082487));

        people.add(new HistoryPerson()
                .createName("伊達政宗", "だてまさむね")
                .createLife(1567, 1638)
                .createCastle("青葉城", 38.150892, 140.512216));

        people.add(new HistoryPerson()
                .createName("北条氏康", "ほうじょううじやす")
                .createLife(1515, 1571)
                .createCastle("小田原城", 35.150377, 129.091239));

        people.add(new HistoryPerson()
                .createName("毛利元就", "もうりもとなり")
                .createLife(1521, 1573)
                .createCastle("吉田郡山城", 34.402747, 132.423452));

        return people;
    }
}

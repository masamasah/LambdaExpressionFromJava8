package com.hrt;

import java.util.ArrayList;
import java.util.List;

public class SimplePerson {
    private String name;
    private String yomi;

    public SimplePerson(String name, String yomi){
        this.name = name;
        this.yomi = yomi;
    }

    public String getName() {
        return name;
    }

    public String getYomi() {
        return yomi;
    }

    public static List<SimplePerson> listPeople(){
        List<SimplePerson> people = new ArrayList<>();

        people.add(new SimplePerson("武田信玄", "たけだしんげん"));
        people.add(new SimplePerson("上杉謙信","うえすぎけんしん"));
        people.add(new SimplePerson("織田信長","おだのぶなが"));
        people.add(new SimplePerson("伊達政宗", "だてまさむね"));
        people.add(new SimplePerson("北条氏康","ほうじょううじやす"));
        people.add(new SimplePerson("毛利元就","もうりもとなり"));

        return people;
    }

}




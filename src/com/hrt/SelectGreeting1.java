package com.hrt;

public class SelectGreeting1 {
    public static void main(String[] args) {
        int myTime = Integer.parseInt(args[0]);

        if (5 <= myTime && myTime <= 10) {
            System.out.print("おはようございます");
        } else if (11 <= myTime && myTime <= 16) {
            System.out.print("こんにちは");
        } else if (17 <= myTime && myTime <= 22) {
            System.out.print("こんばんは");
        } else {
            System.out.print("どうしたんですかこんな時間に");
        }


    }
}

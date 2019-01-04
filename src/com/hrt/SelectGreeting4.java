package com.hrt;

public class SelectGreeting4 {

    public static void main(String[] args) {

        Runnable morning =
                () -> System.out.println("おはようございます");

        Runnable afternoon =
                () -> System.out.println("こんにちは");

        Runnable evening =
                () -> System.out.println("こんばんは");

        Runnable other =
                () -> System.out.println("どうしたんですかこんな時間に");

        int myTime = Integer.parseInt(args[0]);


        if (5 <= myTime && myTime <= 10) {
            morning.run();
        } else if (11 <= myTime && myTime <= 22) {
            afternoon.run();
        } else if (17 <= myTime && myTime <= 22) {
            evening.run();
        } else {
            other.run();
        }
    }
}

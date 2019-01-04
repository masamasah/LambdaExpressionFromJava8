package com.hrt;

public class SelectGreeting3 {
    public static void main(String[] args) {
        Runnable morning = new Runnable() {
            @Override
            public void run() {
                System.out.println("おはようございます");
            }
        };

        Runnable afternoon = new Runnable() {
            @Override
            public void run() {
                System.out.println("こんにちは");
            }
        };

        Runnable evening = new Runnable() {
            @Override
            public void run() {
                System.out.println("こんばんは");
            }
        };

        Runnable other = new Runnable() {
            @Override
            public void run() {
                System.out.println("どうしたんですかこんな時間に");
            }
        };


        int myTime = Integer.parseInt(args[0]);


        if (5 <= myTime && myTime <= 10) {
            afternoon.run();
        } else if (11 <= myTime && myTime <= 22) {
            afternoon.run();
        } else if (17 <= myTime && myTime <= 22) {
            evening.run();
        } else {
            other.run();
        }

    }
}

package com.hrt;

public class SelectGreeting2 {
    public void morning() {
        System.out.println("おはようございます");
    }

    public void afternoon() {
        System.out.println("こんにちは");
    }

    public void evening() {
        System.out.println("こんばんは");
    }

    public void other() {
        System.out.println("どうしたんですかこんな時間に");
    }

    public static void main(String[] args) {
        int myTime = Integer.parseInt(args[0]);

        SelectGreeting2 greet = new SelectGreeting2();

        if (5 <= myTime && myTime <= 10) {
            greet.afternoon();
        } else if (11 <= myTime && myTime <= 22) {
            greet.afternoon();
        } else if (17 <= myTime && myTime <= 22) {
            greet.evening();
        } else {
            greet.other();
        }

    }
}

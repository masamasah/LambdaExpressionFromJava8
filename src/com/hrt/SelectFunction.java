package com.hrt;

public class SelectFunction {

    public static void main(String[] args) {

        Runnable r0 = () -> System.out.println("有効な関数名を指定してください");
        Runnable r1 = () -> System.out.println("関数r1です");

        if (args.length <= 0) {
            r0.run();
        } else {
            switch (args[0]) {
                case "r1":
                    r1.run();
                    break;
                default:
                    r0.run();
                    break;
            }
        }
    }
}

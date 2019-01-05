package com.hrt;

public class SelectFunction {

    public static void main(String[] args) {

        Runnable r0 = () -> System.out.println("有効な関数名を指定してください");
        Runnable r1 = () -> System.out.println("関数r1です");

        Runnable r2 = () -> {
            String name = "ゲスト";

            if(args.length >= 2){
                name = args[1];
            }
            System.out.println("関数r2へようこそ、"+name+"さん");
        };

        if (args.length <= 0) {
            r0.run();
        } else {
            switch (args[0]) {
                case "r1":
                    r1.run();
                    break;
                case "r2":
                    r2.run();
                    break;
                default:
                    r0.run();
                    break;
            }
        }
    }
}

package com.hrt;

public class SelectFunction {

    @FunctionalInterface
    interface MyShape {
        public void draw(int n1, int n2);
    }

    public static void main(String[] args) {

        Runnable r0 = () -> System.out.println("有効な関数名を指定してください");
        Runnable r1 = () -> System.out.println("関数r1です");

        Runnable r2 = () -> {
            String name = "ゲスト";

            if (args.length >= 2) {
                name = args[1];
            }
            System.out.println("関数r2へようこそ、" + name + "さん");
        };

        MyShape myrec = (w, h) -> System.out.println("幅は" + w + "cmで、高さは" + h + "cmの長方形です");

        MyShape mytri = (a, b) -> System.out.println("底辺が" + b + "インチで、等辺が" + a + "インチの二等辺三角形です");

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
                case "myrec":
                    myrec.draw(1, 2);
                    mytri.draw(3, 4);
                    break;
                default:
                    r0.run();
                    break;
            }
        }
    }
}

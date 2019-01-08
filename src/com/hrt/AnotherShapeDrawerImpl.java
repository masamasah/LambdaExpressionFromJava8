package com.hrt;

interface AnotherShapeDrawer{
    public String drawShape(int n1, int n2);
    public String drawRegularShape(int a);
}

public class AnotherShapeDrawerImpl {

    interface RegularShapeDrawer extends  AnotherShapeDrawer{
        public default String drawShape(int n1, int n2) {
            return null;
        }
    }

    public static void main(String[] args){
        RegularShapeDrawer drawer = (a) -> "半径が"+a+"cmの円です";

        System.out.println(drawer.drawRegularShape(50));
    }

}

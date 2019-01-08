package com.hrt;

public class ShapeDrawerimple {
    public static void main(String[] args) {
        ShapeDrawer japaneseRect = (w, d) -> "横は" + w + "cmで、縦は" + d + "cmです";
        ShapeDrawer americanRect = (w, d) -> String.format("width: %.2f inches and Height: %.2f inches", w,d);

        System.out.println(japaneseRect.drawShape(24.5, 39.7));
        System.out.println(americanRect.drawShape(
                americanRect.toInched(24.5),
                americanRect.toInched(39.7)
        ));
    }

}

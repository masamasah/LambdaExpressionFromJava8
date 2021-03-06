package com.hrt;

@FunctionalInterface
public interface ShapeDrawer {
    public String drawShape(double n1, double n2);

    public default double toInched(double cm) {
        return cm / 2.54;
    }

    public default double toCentis(double inch) {
        return inch * 2.54;
    }
}


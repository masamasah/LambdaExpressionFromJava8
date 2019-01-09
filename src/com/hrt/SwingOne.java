package com.hrt;

import javax.swing.*;

public class SwingOne extends JPanel {
    public static void buildApp(){
        JFrame frame = new JFrame("SwingOne");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent myPane = new SwingOne();
        frame.setContentPane(myPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        buildApp();
                    }
                }
        );
    }

}

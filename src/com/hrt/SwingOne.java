package com.hrt;

import javax.swing.*;
import java.awt.*;

public class SwingOne extends JPanel {
    public JLabel titleLabel;
    public JLabel nameLabel;
    public JLabel outputLaqbel;
    public JTextField nameField;
    public JButton sendButton;

    public SwingOne(){
        super(new GridBagLayout());
        setPreferredSize(new Dimension(300, 250));

        GridBagConstraints cstr = new GridBagConstraints();

        titleLabel = new JLabel("名前を入力してください");
        titleLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));

        cstr.gridx = 0;
        cstr.gridy = 0;
        cstr.insets = new Insets(10, 10, 0 , 10);
        cstr.gridwidth = 3;
        add(titleLabel, cstr);

        nameLabel = new JLabel("Name: ");
        cstr.gridx = 0;
        cstr.gridy = 1;
        cstr.insets = new Insets(10, 10, 0, 5);
        cstr.gridwidth = 1;
        add(nameLabel, cstr);

        nameField = new JTextField();
        cstr.gridx = 1;
        cstr.gridy = 1;
        cstr.gridwidth = 2;
        cstr.insets = new Insets(10, 0, 0, 10);
        cstr.fill = GridBagConstraints.HORIZONTAL;
        add(nameField, cstr);

        sendButton = new JButton("確定");
        sendButton.addActionListener(
                (e) -> {
                    outputLaqbel.setText(
                            "こんにちは"+nameField.getText()+"さん"
                    );
                }
        );

        cstr.gridx = 1;
        cstr.gridy = 2;
        cstr.insets = new Insets(0, 10, 0, 10);
        cstr.anchor = GridBagConstraints.EAST;
        cstr.fill = GridBagConstraints.NONE;
        add(sendButton, cstr);

        outputLaqbel = new JLabel("こんにちは");

        cstr.gridx = 0;
        cstr.gridy = 3;
        cstr.gridwidth = 3;
        cstr.insets = new Insets(10, 10, 10, 10);
        cstr.anchor = GridBagConstraints.CENTER;
        add(outputLaqbel, cstr);
    }

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
                SwingOne::buildApp
        );
    }

}

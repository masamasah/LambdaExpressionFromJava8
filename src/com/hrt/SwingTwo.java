package com.hrt;


import java.awt.*;
import javax.swing.*;

public class SwingTwo extends JPanel {
    private JButton startButton;
    private  JLabel taskOutput;
    private Task task;

    class Task extends SwingWorker<Void, Void>{

        @Override
        protected Void doInBackground() {
            int progress = 0;
            setProgress(0);

            while (progress < 10){
                try{
                    Thread.sleep(100);
                }
                catch(InterruptedException ignore){}
                progress++;
                setProgress(progress<10?progress:10);
            }
            return null;
        }

        @Override
        public void done(){
            startButton.setEnabled(true);
        }
    }

    public SwingTwo(){
        super(new BorderLayout());
        startButton = new JButton("Start");

        startButton.addActionListener(
                ae -> {
                    startButton.setEnabled(false);
                    task = new Task();
                    task.addPropertyChangeListener(
                            pe -> {
                                if("progress"==pe.getPropertyName()){
                                    taskOutput.setText((
                                            pe.getNewValue()).toString());
                                }
                            }
                    );
                    task.execute();
                });

        taskOutput = new JLabel("0");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2, 10, 0));
        panel.add(startButton);
        panel.add(taskOutput);
        add(panel, BorderLayout.CENTER);
    }

    private static void buildApp(){
        JFrame frame = new JFrame("StringTwo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComponent newContentPane = new SwingTwo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(
                SwingTwo::buildApp
        );
    }

}


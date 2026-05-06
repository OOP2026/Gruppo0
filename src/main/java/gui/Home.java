package gui;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private static JFrame frame;
    private static Controller controller;
    private JPanel panel;
    private JPanel bacheca1;
    private JPanel bacheca2;
    private JPanel bacheca3;
    private JLabel titolo1;
    private JLabel titolo2;
    private JLabel titolo3;
    private JButton buttonAddToDo1;
    private JButton buttonAddToDo2;
    private JButton buttonAddToDo3;
    private JList list1;
    private JButton exitButton;

    public Home() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Ciao");
                System.exit(0);
            }
        });
        buttonAddToDo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AggiungiToDo aggiungiToDo = new AggiungiToDo(frame, controller);
                aggiungiToDo.frame.setVisible(true);
                frame.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("Home");
        frame.setContentPane(new Home().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        controller = new Controller();
    }

}

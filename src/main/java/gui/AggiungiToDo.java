package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AggiungiToDo {
    JFrame frame;
    private JTextField textTitolo;
    private JTextArea textDescrizione;
    private JLabel labelTitolo;
    private JLabel labelDescrizione;
    private JPanel panelMain;
    private JPanel panelInput;
    private JButton buttonAdd;
    private JButton buttonCancel;


    public AggiungiToDo(JFrame frameChiamante) {
        frame = new JFrame("AggiungiToDo");
        frame.setContentPane(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameChiamante.setVisible(true);
                frame.setVisible(false);
                frame.dispose();
            }
        });
    }
}

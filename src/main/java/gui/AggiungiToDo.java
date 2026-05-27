package gui;

import controller.Controller;
import model.ToDo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * L'interfaccia grafica per aggiungere un ToDo
 */
public class AggiungiToDo {
    /**
     * Cornice della finestra per aggiungere ToDo
     */
    JFrame frame;
    private JTextField textTitolo;
    private JTextArea textDescrizione;
    private JLabel labelTitolo;
    private JLabel labelDescrizione;
    private JPanel panelMain;
    private JPanel panelInput;
    private JButton buttonAdd;
    private JButton buttonCancel;


    /**
     * Instantiates a new Aggiungi to do.
     *
     * @param frameChiamante cornice della finestra da cui siamo arrivati e dobbiamo tornare
     * @param controller     classe unica controller con tutte le funzionalità
     */
    public AggiungiToDo(JFrame frameChiamante, Controller controller) {
        frame = new JFrame("AggiungiToDo");
        frame.setContentPane(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validazione dell'input
                if(textTitolo.getText().equals("") || textDescrizione.getText().equals("")) {
                    JOptionPane.showMessageDialog(frame, "Non hai riempito tutti i campi!");
                } else {
                    // Controllo dell'elaborazione
                    if (controller.aggiungiToDo(textTitolo.getText(), textDescrizione.getText())) {
                        frameChiamante.setVisible(true);
                        frame.dispose();
                    } else {
                        // Elaborazione non valida
                        JOptionPane.showMessageDialog(frame, "Qualcosa e' andato storto");
                    }
                }
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

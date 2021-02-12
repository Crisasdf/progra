package Clases;

import javax.swing.*;

public class timbreMicroondas {

    public int avisoBip(int segundos) {

        JOptionPane.showMessageDialog(null,"Quedan:" + segundos + " " + "Segundos");

        for (int i = segundos; i > 0; i--) {

            segundos = segundos - 1;

            JOptionPane.showMessageDialog(null, "Quedan: " + segundos + " " + "Segundos");

        }
        return segundos;
    }
}

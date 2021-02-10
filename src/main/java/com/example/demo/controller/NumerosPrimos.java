package com.example.demo.controller;

import javax.swing.*;

public class NumerosPrimos {

    public void calcularNumeroPrimo() {
        //Calcule que numeros primos entre 1 y 20 -->numeros primos son los dividos por si mismo y 1
        for (int i = 2; i <= 20; i++) {
            int contador = 0;
            for (int j = 2; j <= 20; j++) {
                if (contador < 2) {
                    if (i % j == 0) {
                        contador = contador + 1;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El numero " + i + " No es primo");
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Terminó el ciclo");
    }
}

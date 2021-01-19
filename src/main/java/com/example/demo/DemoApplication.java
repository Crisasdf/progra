package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.setProperty("java.awt.headless", "false");

        //Decir nombre y dar una caracteristica
        String name = JOptionPane.showInputDialog("Favor, diga su nombre: ");
        if ("rafa".equals(name) || "matias".equals(name) || "rafita".equals(name) || "guapo".equals(name)) {
            JOptionPane.showMessageDialog(null, "El " + name + " es flaco");
        } else if ("pipe".equals(name)) {
            JOptionPane.showMessageDialog(null, "El " + name + " tambien es flaco");
        } else if ("chelo".equals(name)) {
            JOptionPane.showMessageDialog(null, "El " + name + " tiene 3 hijos");
        } else {
            JOptionPane.showMessageDialog(null, "Al " + name + " no le tenia nada preparado");
        }

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

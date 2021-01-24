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


        //Avisar cuando la cocina esté a 100 grados si es que estaba al inicio en 0 grados y va aumentando de 10 grados a la vez
        int temperaturaCocina = 0;
        int grados = 10;
        while (temperaturaCocina < 100) {
            temperaturaCocina = temperaturaCocina + grados;
            if (temperaturaCocina < 100) {
                JOptionPane.showMessageDialog(null, "La cocina todavia no está lista, va en " + temperaturaCocina + " grados");
            }
        }
        JOptionPane.showMessageDialog(null, "La cocina está lista, llegó a los " + temperaturaCocina + " grados");

        //Preguntar hasta que usuario diga detente
        String order = "";
        do {
            order = JOptionPane.showInputDialog(null, "Quiere que me detenga?");
        } while (!order.equals("detente"));


        String opcion = JOptionPane.showInputDialog(null, "Por favor ingrese a que clase quiere ingresar\n1.-Cocina\n2.-Informatica");
        switch (opcion) {
            case "1":
                //Cocinar
                JOptionPane.showMessageDialog(null, "Bienvenido a la clase de cocina");
                break;
            case "2":
                //Informatica
                JOptionPane.showMessageDialog(null, "Bienvenido a la clase de informatica");
                break;
            default:
                //salir
                JOptionPane.showMessageDialog(null, "Vayase a la verga");
                break;
        }
    }
}

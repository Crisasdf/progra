package com.example.demo.controller;

import javax.swing.*;

public class Saludo {

    public void saludoSegunEmocion(String opcion) {
        switch (opcion) {
            case "1":
                //Saludo
                JOptionPane.showMessageDialog(null, "Buens dias, como has estado");
                break;
            case "2":
                // Despedida
                JOptionPane.showMessageDialog(null, "Nos vemos, que estes bien");
                break;
            case "3":
                //Agradecimiento
                JOptionPane.showMessageDialog(null, "Gracias por su desempeño en esto");
                break;
            case "4":
                //Rabia
                JOptionPane.showMessageDialog(null, "Andai pasao a caca, vete a la verga");
                break;
            default:
                //salir
                JOptionPane.showMessageDialog(null, " no tengo esos datos");
        }
    }

    public String saludoSegunPais(String opcion) {
        switch (opcion) {
            case "1":
                //Saludo
                return "Hola";
            case "2":
                // Despedida
                return "Hello";
            case "3":
                //Agradecimiento
                return "挨拶";
            case "4":
                //Rabia
                return "Bon sou";
            default:
                //salir
                return " no tengo esos datos";
        }
    }
}

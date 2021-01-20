package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.setProperty("java.awt.headless", "false");




        //EJERCICIO 1
         int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción a convertir: \n1)CLP A USD\n2)USD A CLP"));
         if(opcion == 1) {
             int inClp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor En CLP:"));

             double usd = 0.00125;
             double conversionPd = inClp * usd;
             int formConversionPd = (int)conversionPd;


             JOptionPane.showMessageDialog(null, "Los " + inClp + " CLP equivalen  a: " + formConversionPd + " USD");
         }if(opcion == 2) {
             int inUsd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor En USD:"));
             double clp = 800;
             double conversionDp = inUsd * clp;
             int  formConversionDp = (int)conversionDp;
             JOptionPane.showMessageDialog(null, "Los " + inUsd + " USD equivalen  a: " + formConversionDp + " CLP");

        }
         //EJERCICIO 2
         String nombreIn = JOptionPane.showInputDialog("Ingrese su nombre: ");
         String apellidoIn = JOptionPane.showInputDialog("Ingrese su apellido: ");
         String sexoIn = JOptionPane.showInputDialog("Ingrese su sexo: ");
         int edadIn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
         if(edadIn > 120){

             JOptionPane.showMessageDialog(null, "Ya estas en descomposicion");


        }

         if ("mujer".equals(sexoIn) && edadIn >= 30 && edadIn < 120) {


             JOptionPane.showMessageDialog(null, "Buenos días señora " + nombreIn + " " + apellidoIn);

        } if ("mujer".equals(sexoIn) && edadIn < 30) {

             JOptionPane.showMessageDialog(null, "Buenos días señorita " + nombreIn + " " + apellidoIn);

         }if ("hombre".equals(sexoIn) && edadIn >= 30 && edadIn < 120){
             JOptionPane.showMessageDialog(null, "Buenos días señor " + nombreIn +  " " + apellidoIn );

         }if ("hombre".equals(sexoIn) && edadIn < 30) {
        JOptionPane.showMessageDialog(null, "Buenos días joven " + nombreIn + " " + apellidoIn);
    }
        //EJERCICIO 3
        int exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente de 3: "));

        int base = 3;
        int resultado = 1;
        for(int i =1; i <= exponente; i++){
            resultado = resultado * base;
        }
        JOptionPane.showMessageDialog(null, "el resultado es:" + resultado);
         /*

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

          */
    }
}

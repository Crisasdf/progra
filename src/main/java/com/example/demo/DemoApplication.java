package com.example.demo;

import Clases.estimarEdad;
import Clases.nombreApellido;
import Clases.timbreMicroondas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.imageio.ImageTranscoder;
import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.setProperty("java.awt.headless", "false");





    String opcion = JOptionPane.showInputDialog("Elija una opcion: \n 1)Nombre y Apellido \n 2)Timbre de microondas\n 3)Estimar edad \n 4)Salir");

        //while(opcion == "1" || opcion == "2" || opcion == "3" || opcion == "4") {


            switch (opcion) {
                case "1":
                    //Opcion 1
                    nombreApellido nomApe = new nombreApellido();


                    String nombre = JOptionPane.showInputDialog("Nombre: ");
                    String apellido = JOptionPane.showInputDialog("Apellido: ");

                    String saludo = nomApe.saludaNombre(nombre, apellido);

                    JOptionPane.showMessageDialog(null, "Hola ," + saludo);
                    break;
                case "2":
                    //Opcion 2

                    timbreMicroondas bipbip = new timbreMicroondas();

                    int segundos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo: "));

                    int sonido = bipbip.avisoBip(segundos);

                    if (sonido == 0) {
                        JOptionPane.showMessageDialog(null, "Bipp Bipp....");
                    }
                    break;
                case "3":
                    //OPcion 3

                    estimarEdad devuelveEdad = new estimarEdad();

                    int anoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese año de nacimiento :"));

                    int miEdad = devuelveEdad.queEdad(anoNacimiento);

                    JOptionPane.showMessageDialog(null, "Su edad es : " + miEdad);
                    break;
                case "4":

                    JOptionPane.showMessageDialog(null, "Adios....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");


            }


        }






        //Ejercicio 1
        /*

        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor cateto1 : "));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor cateto1 : "));

        double hypo;
        hypo = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        hypo = Math.pow(hypo,0.5);

        JOptionPane.showMessageDialog(null, "Valor de la hipotenusa es: " + hypo);

        //Ejercicio 2


        String emotion = JOptionPane.showInputDialog("Escriba una emocion predeterminada: " + "\n " +
               "1)Saludo\n" +
               "2)Despedida\n" +
                "3)Agradecimiento\n" +
                "4)Rabia");

        do{

             emotion = JOptionPane.showInputDialog("Escriba una emocion predeterminada: " + "\n " +
                    "1)Saludo\n" +
                    "2)Despedida\n" +
                    "3)Agradecimiento\n" +
                    "4)Rabia");
        }while (!emotion.equals("saludo") || !emotion.equals("despedida") || !emotion.equals("agradecimiento") || !emotion.equals("rabia"));

        switch (emotion){
            case "saludo" :
                JOptionPane.showMessageDialog(null,"Buen dia humano!");
                break;

            case "despedida":
                JOptionPane.showMessageDialog(null,"Hasta luego humano!");
                break;
            case "agradecimiento":
                JOptionPane.showMessageDialog(null,"Muchas gracias humano!");
                break;
            case "rabia":
                JOptionPane.showMessageDialog(null,"Enojese humano!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Todo bien en casa?!");

                break;

        }

        //Ejercicio 3
         double tope = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero de tope para calcular raices cuadradas enteras: "));

        for(int i = 1;i <=tope;i++){

            double resultado = Math.pow(i,0.5);
            if(resultado % 1 == 0) {
                JOptionPane.showMessageDialog(null, "La raiz " + i + " da resultado entero y es :" + "\n" +
                        "***" + resultado + "***");
            }else{
                    JOptionPane.showMessageDialog(null,"La raiz  " +  i  + "  no da resultado entero");
                }
            }

        }




/*

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



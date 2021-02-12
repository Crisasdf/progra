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


        String opcion = "";
        boolean bandera =false;

        do {
            opcion = JOptionPane.showInputDialog("Elija una opcion: \n 1)Nombre y Apellido \n 2)Timbre de microondas\n 3)Estimar edad \n 4)Salir");
            if(!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4")){
                JOptionPane.showMessageDialog(null,"Opcion no valida!!!");
                bandera = true;

            }else{
                bandera =false;

            }
        } while (bandera);


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



        }


    }
}




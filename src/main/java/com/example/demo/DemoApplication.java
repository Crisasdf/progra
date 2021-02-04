package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.setProperty("java.awt.headless", "false");

        /*Decir nombre y dar una caracteristica
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
    */
/*ejercicio 1
        double cateto2 = Integer.parseInt(JOptionPane.showInputDialog(" indique su cateto2"));
        double cateto3 = Integer.parseInt(JOptionPane.showInputDialog(" indique su cateto3"));

            double hypo = 0;

            hypo = (cateto2 * cateto2) + (cateto3 * cateto3);

            hypo = Math.pow(hypo, 0.5);
            {
                JOptionPane.showMessageDialog(null, "La hipotenusa es " + " " + hypo);
            }
    }}*/
  /*ejercicio 2

        switch ( JOptionPane.showInputDialog("ingrese que opcion desea \n1) Saludo \n2) Despedida \n3) Agradecimiento \n4) Rabia")){
            case "1":
                //Saludo
                JOptionPane.showMessageDialog(null,"Buens dias, como has estado");
                break;
            case "2":
                // Despedida
                JOptionPane.showMessageDialog(null,"Nos vemos, que estes bien");
                break;
            case "3":
                //Agradecimiento
                JOptionPane.showMessageDialog(null,"Gracias por su desempeño en esto");
                break;
            case "4":
                //Rabia
                JOptionPane.showMessageDialog(null,"Andai pasao a caca, vete a la verga");
                break;
            default:
                //salir
                JOptionPane.showMessageDialog(null," no tengo esos datos");
        */

        //Ejercicio 3
       double tope = Double.parseDouble(JOptionPane.showInputDialog(" ingrese su numero"));
        for (int i = 1; i <= tope; i++) {
            double resultado = Math.pow(i, 0.5);
         if (resultado % 1 == 0 )

            JOptionPane.showMessageDialog(null, "El numero " + i + " Tiene raiz cuadrada");


        }




        /*Ejercicio3
        El usuario ingresará un numero de tope y se deben mostrar las raices cuadradas ENTERAS de los numeros entre ese rango
        Por ejemplo, si el usuario ingreso el numero 10, se deben calcular la raiz cuadrada de 1, 2, 3, 4, 5, 6, 7, 8, 9 y 10
        pero solo se deben mostrar la raiz de 1, 4 y 9, ya que todas las otras raices contienen decimales, por lo tanto no son enteras.

                Considerar
                -Los inputs deben estar validados para que el programa no tenga errores de ejecución.
                -La inversa un x² es √x (raiz cuadrada), por lo tanto, si sabemos que x² = 100, sacamos la raíz cuadrada del valor y nos queda x = 10*/

    }}
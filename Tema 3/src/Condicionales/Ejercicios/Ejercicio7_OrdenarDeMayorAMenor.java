package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio7_OrdenarDeMayorAMenor {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 2: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 3: "));
        if (numero1>numero2 && numero2>numero3){
            System.out.print(numero1 + ",");
            System.out.print(numero2 + ",");
            System.out.print(numero3);
        } else if (numero1 > numero3 && numero3 > numero2) {
            System.out.print(numero1 + ",");
            System.out.print(numero3 + ",");
            System.out.print(numero2);
        } else if (numero2 > numero1 && numero1 > numero3) {
            System.out.print(numero2 + ",");
            System.out.print(numero1 + ",");
            System.out.print(numero3);
        } else if (numero2>numero3 && numero3 > numero1) {
            System.out.print(numero2 + ",");
            System.out.print(numero3 + ",");
            System.out.print(numero1);
        } else if (numero3 > numero1 && numero1 > numero2) {
            System.out.print(numero3 + ",");
            System.out.print(numero1 + ",");
            System.out.print(numero2);
        }else {
            System.out.print(numero3 + ",");
            System.out.print(numero2 + ",");
            System.out.print(numero1);
        }


    }
}

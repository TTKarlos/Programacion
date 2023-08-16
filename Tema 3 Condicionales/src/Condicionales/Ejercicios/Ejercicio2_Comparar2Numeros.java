package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio2_Comparar2Numeros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 2: "));
        if (numero1 == numero2){
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        } else if (numero1 >= numero2) {
            JOptionPane.showMessageDialog(null, "El numero 1 es mayor");
        }else {
            JOptionPane.showMessageDialog(null,"El numero 2 es mayor");
        }

    }
}

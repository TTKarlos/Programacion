package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio8_DecirCuantasCifrasTiene {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 0-99.999: "));
        if (numero<10){
            JOptionPane.showMessageDialog(null,"El numero tiene 1 cifras");
        } else if (numero<100) {
            JOptionPane.showMessageDialog(null,"El numero tiene 2 cifras");
        } else if (numero<1000) {
            JOptionPane.showMessageDialog(null,"El numero tiene 3 cifras");
        } else if (numero<10000) {
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
        } else if (numero<100000) {
            JOptionPane.showMessageDialog(null,"El numero tiene 5 cifras");
        }else {
            JOptionPane.showMessageDialog(null,"El numero esta fuera del rango");
        }
    }
}

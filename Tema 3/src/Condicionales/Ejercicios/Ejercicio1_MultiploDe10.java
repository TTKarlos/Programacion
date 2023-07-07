package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio1_MultiploDe10 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));
        JOptionPane.showMessageDialog(null,(numero%10 == 0) ? "Es multiplo de 10" : "No es multiplo de 10");
    }
}

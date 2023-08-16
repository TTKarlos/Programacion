package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio6_ParImpar {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2: "));
        if (numero1%2 == 0 && numero2%2 == 0){
            JOptionPane.showMessageDialog(null,"Los numeros son pares");
        } else if (numero1%2 != 0 && numero2%2 != 0) {
            JOptionPane.showMessageDialog(null, "Los numeros son impares");
        }else {
            JOptionPane.showMessageDialog(null, "Un numero es par y el otro impar");
        }
    }
}

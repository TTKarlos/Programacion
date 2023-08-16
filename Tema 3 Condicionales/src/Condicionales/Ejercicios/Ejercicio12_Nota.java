package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio12_Nota {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu nota: "));
        if (nota <= 4){
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota == 5) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (nota == 6) {
            JOptionPane.showMessageDialog(null, "Bien");
        } else if (nota <= 8) {
            JOptionPane.showMessageDialog(null, "Notable");
        } else if (nota <= 10) {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }else {
            JOptionPane.showMessageDialog(null, "Fuera del rango");
        }
    }
}

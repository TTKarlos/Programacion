package Condicionales;

import javax.swing.*;

public class Switch_Simplificado {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1-6: "));
        switch (valor) {
            case 1 -> JOptionPane.showMessageDialog(null, "Este es el numero 1");
            case 2 -> JOptionPane.showMessageDialog(null, "Este es el numero 2");
            case 3 -> JOptionPane.showMessageDialog(null, "Este es el numero 3");
            case 4 -> JOptionPane.showMessageDialog(null, "Este es el numero 4");
            case 5 -> JOptionPane.showMessageDialog(null, "Este es el numero 5");
            case 6 -> JOptionPane.showMessageDialog(null, "Este es el numero 6");
            default -> JOptionPane.showMessageDialog(null, "Este numero no esta en el rango de 1-6");
        }
    }
}

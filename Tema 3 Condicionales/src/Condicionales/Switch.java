package Condicionales;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1-6: "));
        switch (valor){
            case 1:
                JOptionPane.showMessageDialog(null,"Este es el numero 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Este es el numero 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Este es el numero 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Este es el numero 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Este es el numero 5");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Este es el numero 6");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Este numero no esta en el rango de 1-6");
        }
    }
}

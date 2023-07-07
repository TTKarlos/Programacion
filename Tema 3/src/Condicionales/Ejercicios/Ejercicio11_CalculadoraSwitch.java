package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio11_CalculadoraSwitch {
    public static void main(String[] args) {
        String respuestaUsuario;
        int numero1;
        int numero2;
        int solucion;
        respuestaUsuario = JOptionPane.showInputDialog("Que quieres hacer?: ");
        switch (respuestaUsuario){
            case "S":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 + numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "s":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 + numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "R":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 - numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "r":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 - numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "P":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 * numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "p":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 * numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "M":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 * numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "m":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 * numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "D":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 / numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            case "d":
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 1: "));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el valor del numero 2: "));
                solucion = numero1 / numero2;
                JOptionPane.showMessageDialog(null,solucion);
                break;
            default:
               JOptionPane.showMessageDialog(null,"No esta dentro del rango");
                break;
        }
    }
}

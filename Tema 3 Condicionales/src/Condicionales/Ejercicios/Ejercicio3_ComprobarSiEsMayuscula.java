package Condicionales.Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class Ejercicio3_ComprobarSiEsMayuscula {
    public static void main(String[] args) {

        char caracter;
        caracter = JOptionPane.showInputDialog("Escibe una letra: ").charAt(0);
        if (Character.isUpperCase(caracter)) {
            JOptionPane.showMessageDialog(null, "Es mayusculas");
        }else {
            JOptionPane.showMessageDialog(null, "No es mayusculas");
        }



    }

}

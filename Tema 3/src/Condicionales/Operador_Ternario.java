package Condicionales;

import javax.swing.*;

public class Operador_Ternario {
    public static void main(String[] args) {
        int numero;
        String  mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));

        mensaje = (numero%2 == 0) ? "Es par" : "Es impar";
        JOptionPane.showMessageDialog(null,mensaje);
    }
}

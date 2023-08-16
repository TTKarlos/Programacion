package Condicionales;

import javax.swing.*;

public class If_Else {
    public static void main(String[] args) {
        int numero;
        int valor = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero: "));

        if (numero == valor){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es diferente");
        }
    }
}

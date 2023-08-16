package Condicionales.Ejercicios;

import javax.swing.*;

public class Ejercicio4_Descuentos {
    public static void main(String[] args) {
        float cantidadAPagar;
        float descuento;
        cantidadAPagar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto tienes que pagar? "));

        if (cantidadAPagar >= 300){
            descuento = cantidadAPagar * 0.20f;
            cantidadAPagar -= descuento;
            JOptionPane.showMessageDialog(null,cantidadAPagar);
        }else {
            JOptionPane.showMessageDialog(null, cantidadAPagar);
        }






    }
}

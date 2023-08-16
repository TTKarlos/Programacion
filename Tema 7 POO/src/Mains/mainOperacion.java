package Mains;

import Objetos.Operacion;

public class mainOperacion {
    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.leerNumeros();
        op1.sumar();
        op1.resta();
        op1.multiplicacion();
        op1.division();
        op1.mostrarDatos();
    }
}

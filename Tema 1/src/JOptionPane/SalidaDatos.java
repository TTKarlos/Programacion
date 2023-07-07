package JOptionPane;
import javax.swing.*;
public class SalidaDatos {
    public static void main(String[] args) {
        String palabra;
        int entero;
        char letra;
        double decimal;

        palabra = JOptionPane.showInputDialog("Escribe una palabra: ");
        entero  = Integer.parseInt(JOptionPane.showInputDialog("Escribe un entero: "));
        letra = JOptionPane.showInputDialog("Escribe una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escibe un decimal: "));

        JOptionPane.showMessageDialog(null,"La cadena es: " + palabra);
        JOptionPane.showMessageDialog(null,"La entero es: " + entero);
        JOptionPane.showMessageDialog(null,"La letra es: " + letra);
        JOptionPane.showMessageDialog(null,"El decimal es: " + decimal);

        /*Integer.parseInt sirve para converter un entero en cadena*/
    }

}

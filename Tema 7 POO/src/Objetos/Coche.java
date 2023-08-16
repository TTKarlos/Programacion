package Objetos;

public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    //Metodo
    public static void main(String[] args) {
        System.out.println("OBJETO 1 COCHE");
        Coche coche1  = new Coche();
        coche1.color = "Verde";
        coche1.marca = "Lamborghini";
        coche1.km = 0;

        System.out.println("El color del coche 1 es: " + coche1.color);
        System.out.println("La marca del coche 1 es: " + coche1.marca);
        System.out.println("Los km del coche 1 es: " + coche1.km);


        System.out.println("------------------------------------------------");

        System.out.println("OBJETO 2 COCHE");
        Coche coche2 = new Coche();
        coche2.color = "Gris";
        coche2.marca = "Porche";
        coche2.km = 192435;


        System.out.println("El color del coche 2 es: " + coche2.color);
        System.out.println("La marca del coche 2 es: " + coche2.marca);
        System.out.println("Los km del coche 2 es: " + coche2.km);
    }
}

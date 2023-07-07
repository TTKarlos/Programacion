package Actividad1;
public class Lectores {
    final static int MAX_EJEMPLARES = 3;
    private String numSocios;
    private String nombre;
    private String direccion;
    private String telefono;

    public Lectores(String numSocios, String nombre, String direccion, String telefono) {
        this.numSocios = numSocios;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int ejemplaresALaVez(int MAX_EJEMPLARES){
        System.out.println("Metodo que gestiona los ejemplares maximos que puede tener un cliente");
        return MAX_EJEMPLARES;
    }

    public int sacionPorRetraso (){
        System.out.println("Metodo que gestiona las saciones por retraso de la devolucion de los libros a dichos clientes");
        return 1;
    }
}

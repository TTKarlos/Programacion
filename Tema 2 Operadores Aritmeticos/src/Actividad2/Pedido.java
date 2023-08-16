package Actividad2;

import java.util.Date;
import java.util.PropertyResourceBundle;

public class Pedido {
    private String cliente;
    private Date fecha;
    private boolean pagado;
    private FormaDePago formaDePago;

    public Pedido(String cliente, Date fecha, boolean pagado) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.pagado = pagado;
    }

    private void setPagado (){

    }

    private float calcularPrecio(){
        System.out.println("Nos permite calcular el precio del pedido acumulandolo");
        return 1;
    }

}

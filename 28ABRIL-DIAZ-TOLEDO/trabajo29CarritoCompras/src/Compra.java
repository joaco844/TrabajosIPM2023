import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private ArrayList<Carrito> carritos;
    private Date fecha;
    private int monto;

    public Compra(ArrayList<Carrito> carritos, Date fecha, int monto) {
        this.carritos = new ArrayList<>();
        this.fecha = fecha;
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    public void generarCompra(Carrito unCarrito,int monto){
        for (Carrito otroCarrito:carritos) {
            if (otroCarrito==unCarrito){
                carritos.remove(otroCarrito);
                System.out.println("gracias por comprar!");
            }else {
                System.out.println("no existe ese carrito");
            }
        }
    };
}

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private Cliente unCliente;

    public Carrito( Cliente unCliente) {
        this.productos = new ArrayList<>();
        this.unCliente = unCliente;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void  eliminarProducto(Producto producto){
        for (Producto unProducto:productos) {
            if (unProducto == producto){
                productos.remove(producto);
            }else {
                System.out.printf("no se pudo encontrar el producto");
            }
        }
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private String mail;
    private ArrayList<Tarjeta> tarjetas;
    private boolean prefrencial;

    public Cliente(String nombre, String direccion, String mail, Tarjeta direccionDeCobro, boolean prefrencial) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
        this.tarjetas = new ArrayList<Tarjeta>();
        this.prefrencial = prefrencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isPrefrencial() {
        return prefrencial;
    }

    public void setPrefrencial(boolean prefrencial) {
        this.prefrencial = prefrencial;
    }

    public void eliminarMetodoDePago(Tarjeta unaTarjeta){
        for(Tarjeta otraTarjeta : tarjetas){
            if(otraTarjeta == unaTarjeta){
                tarjetas.remove(otraTarjeta);
            }else {
                System.out.printf("no se encontro la tarjeta");
            }
        }
    }
    public void agregarMetodoDePago(Tarjeta unaTarjeta){
        tarjetas.add(unaTarjeta);
    }
}

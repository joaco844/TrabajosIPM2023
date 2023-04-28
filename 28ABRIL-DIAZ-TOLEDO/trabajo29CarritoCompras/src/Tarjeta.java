import java.util.Date;

public class Tarjeta {
    private int numero;
    private Date vencimiento;
    private String titular;

    public Tarjeta() {
        this.numero = 123;
        this.vencimiento = new Date("12-12-2001");
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void agregarTarjeta(int numero, Date fechaVencimiento, String titular){
        this.numero = numero;
        this.vencimiento = fechaVencimiento;
        this.titular = titular;
    }
    public void eliminarTarjeta(int numero, String titular){
        if (this.titular.equals(titular) || this.numero == numero ){
            this.titular = "";
            this.numero =  0;
            this.vencimiento = null;
        }
    };

}

package clases;

public class Mueble {

    private String tipo;

    private double tamanio;

    private Madera madera;
    
    private float precio;

    public Mueble() {
    }
    
    public Mueble(String tipo, double tamanio, Madera madera, float precio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.madera = madera;
        this.precio = precio;
    }

    public void actualizarStockMadera(){
        madera.actualizarCantidad();
    }
    public void obtenerStockMadera(){
        madera.obtenerStock();
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public Madera getMadera() {
        return madera;
    }

    public void setMadera(Madera madera) {
        this.madera = madera;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}

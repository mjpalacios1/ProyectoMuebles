public class Mueble {

    private String tipo;

    private String tamanio;

    private Madera madera;
    
    private float precio;

    public Mueble() {
    }

    public Mueble(String tipo, String tamanio, Madera madera, float precio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.madera = madera;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
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

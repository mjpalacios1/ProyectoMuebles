package clases;

public class Compra {

    private int cantidad;

    private float precio;

    private int codigo;

    Proveedor proveedor;
    Madera madera;
    
    public Compra() {
    }

    public Compra(int cantidad, float precio, int codigo, Proveedor proveedor, Madera madera) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.madera = madera;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Madera getMadera() {
        return madera;
    }

    public void setMadera(Madera madera) {
        this.madera = madera;
    }
    
    public void agregarMadera(Compra c){
        
    }
   
}

package clases;

public class Compra {

    private int cantidad;


    Proveedor proveedor;
    Madera madera;
    
    public Compra() {
    }

    public Compra(int cantidad,Proveedor proveedor, Madera madera) {
        this.cantidad = cantidad;
        
       
        this.proveedor = proveedor;
        this.madera = madera;
    }

    public void realizarCompra(){
        madera.actualizarCantidad();
        proveedor.InsertarProveedor();
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

package clases;


import java.util.ArrayList;

public class Venta {

   
    private float total;

    private int codigo;
    
    Cliente cliente;
    ArrayList<Mueble>muebles;
    
    public Venta() {
    }

    public Venta( float total, int codigo, Cliente cliente, ArrayList<Mueble> muebles) {
        
        this.total = total;
        this.codigo = codigo;
        this.cliente = cliente;
        this.muebles = muebles;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }
 

    
    public float getPrecio() {
        return total;
    }

    public void setPrecio(float precio) {
        this.total = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void realizarVenta(){
        cliente.InsertarCliente();
        
    }
 
   
}

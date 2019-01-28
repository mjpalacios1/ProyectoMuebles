package clases;


import java.util.ArrayList;

public class Venta {

    private int cantidad;

    private float total;

    private int codigo;
    
    Cliente cliente;
    ArrayList<Mueble>muebles;
    
    public Venta() {
    }

    public Venta(int cantidad, float total, int codigo, Cliente cliente, ArrayList<Mueble> muebles) {
        this.cantidad = cantidad;
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
 

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
    public double calcularCosto(){
        double resultado=0;
        for (int i = 0; i < muebles.size(); i++) {
            resultado+=muebles.get(i).getPrecio();
        }
        return resultado;
    }
    public void aniadirMueble(Mueble m){
        muebles.add(m);
    }
    public double obtenerMadera(){
        double resultado=0;
        for (int i = 0; i < muebles.size(); i++) {
            resultado+=muebles.get(i).getTamanio();
        }
        return resultado;
    }
   
}

package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Madera {

    private String tipo;

    private float cantidad;

    public Madera() {
    }

    public Madera(String tipo, float cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    public void actualizarCantidad(){
        Conexion coneccionBD = new Conexion();
         Connection con;
         float cantidadantigua=obtenerStock();
         try {
             System.out.println(cantidad);
               con = coneccionBD.obtener();
            PreparedStatement psInsertar = con.prepareStatement("UPDATE madera set cantidad=" + (cantidadantigua+cantidad)+"where tipo= '" + tipo + "'");
            psInsertar.execute();
            coneccionBD.cerrar();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
     
        }
    }
    public float obtenerStock(){
        Conexion coneccionBD = new Conexion();
         Connection con;
         float cant=0;
         try {
            con = coneccionBD.obtener();
            java.sql.Statement ejecutor = con.createStatement();
            ResultSet rs = ejecutor.executeQuery("Select cantidad from madera where tipo= '" + tipo + "'");
            while (rs.next()) {
              cant=(float)(rs.getDouble(1));
            }
            coneccionBD.cerrar();
            return cant;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
     
        }
    }
     public ArrayList<Madera> obtenerMaderas(){
        Conexion coneccionBD = new Conexion();
         Connection con;
         ArrayList<Madera>maderas=new ArrayList();
         try {
            con = coneccionBD.obtener();
            java.sql.Statement ejecutor = con.createStatement();
            ResultSet rs = ejecutor.executeQuery("Select * from madera");
            while (rs.next()) {
              maderas.add(new Madera(rs.getString("tipo"),(float)(rs.getDouble("cantidad"))));
            }
            coneccionBD.cerrar();
            return maderas;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return maderas;
     
        }
    }
}

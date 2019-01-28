package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Madera {

    private String tipo;

    private float cantidad=0;

    public Madera() {
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
         float cantidadantigua=0;
         try {
            con = coneccionBD.obtener();
            java.sql.Statement ejecutor = con.createStatement();
            ResultSet rs = ejecutor.executeQuery("Select cantidad from madera where tipo= '" + tipo + "'");
            while (rs.next()) {
               cantidadantigua=(float)(rs.getDouble(1));
            }
            PreparedStatement psInsertar = con.prepareStatement("UPDATE madera set cantidad=" + (cantidadantigua+cantidad)+"where tipo= '" + tipo + "'");
            psInsertar.execute();
            coneccionBD.cerrar();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
     
        }
    }
}

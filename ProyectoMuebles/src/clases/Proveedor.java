package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Proveedor extends Persona {

    private int codigo;

    private String direccion;

    public Proveedor() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     public void InsertarProveedor() {
         Conexion coneccionBD = new Conexion();
          Connection con;
         PreparedStatement psInsertar;
        try {
            con = coneccionBD.obtener();
            psInsertar = con.prepareStatement("INSERT INTO proveedor (cedula,nombre,telefono,direccion)" + " values(?,?,?,?)");
            psInsertar.setString(1,getCedula());
            psInsertar.setString(1,getNombre());
            psInsertar.setString(1,getTelefono());
            psInsertar.setString(1,getDireccion()); 
            psInsertar.execute();
            coneccionBD.cerrar();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
     
        }
    }

    
}

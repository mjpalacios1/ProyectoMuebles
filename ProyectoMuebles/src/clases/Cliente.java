package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente extends Persona {

    private int codigo;

    private String direccion;

    public Cliente() {
    }

    public Cliente(int codigo, String direccion, String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.codigo = codigo;
        this.direccion = direccion;
    }
     public void InsertarCliente() {
         Conexion coneccionBD = new Conexion();
          Connection con;
         PreparedStatement psInsertar;
        try {
            con = coneccionBD.obtener();
            psInsertar = con.prepareStatement("INSERT INTO cliente (cedula,nombre,telefono,direccion)" + " values(?,?,?,?)");
            psInsertar.setString(1,getCedula());
            psInsertar.setString(2,getNombre());
            psInsertar.setString(3,getTelefono());
            psInsertar.setString(4,getDireccion()); 
            psInsertar.execute();
            coneccionBD.cerrar();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
     
        }
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
    
}

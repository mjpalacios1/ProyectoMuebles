package clases;

public class Empleado extends Persona {

    private int numId;

    private String areaTrabajo;

    public Empleado() {
    }

    public Empleado(int numId, String areaTrabajo) {
        this.numId = numId;
        this.areaTrabajo = areaTrabajo;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    
}

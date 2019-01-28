package clases;

public class FabricacionMueble {

    private String articulos;

    private String acabados;

    Mueble mueble;
    public FabricacionMueble() {
    }

    public FabricacionMueble(String articulos, String acabados, Mueble mueble) {
        this.articulos = articulos;
        this.acabados = acabados;
        this.mueble = mueble;
    }

    public String getArticulos() {
        return articulos;
    }

    public void setArticulos(String articulos) {
        this.articulos = articulos;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }
    
}

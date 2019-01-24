package bufeotec.com.appvet.Modelo;

public class Especies {

    private String especies_id;
    private String especies_nombre;

    public Especies() {
    }

    public Especies(String especies_nombre) {
        this.especies_nombre = especies_nombre;
    }

    public String getEspecies_id() {
        return especies_id;
    }

    public void setEspecies_id(String especies_id) {
        this.especies_id = especies_id;
    }

    public String getEspecies_nombre() {
        return especies_nombre;
    }

    public void setEspecies_nombre(String especies_nombre) {
        this.especies_nombre = especies_nombre;
    }
}

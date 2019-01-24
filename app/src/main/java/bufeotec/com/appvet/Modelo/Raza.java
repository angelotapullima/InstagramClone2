package bufeotec.com.appvet.Modelo;

public class Raza {

    private String raza_id;
    private String raza_nombre;
    private String especies_id;

    public Raza() {
    }

    public Raza(String raza_nombre, String especies_id) {
        this.raza_nombre = raza_nombre;
        this.especies_id = especies_id;
    }

    public String getRaza_id() {
        return raza_id;
    }

    public void setRaza_id(String raza_id) {
        this.raza_id = raza_id;
    }

    public String getRaza_nombre() {
        return raza_nombre;
    }

    public void setRaza_nombre(String raza_nombre) {
        this.raza_nombre = raza_nombre;
    }

    public String getEspecies_id() {
        return especies_id;
    }

    public void setEspecies_id(String especies_id) {
        this.especies_id = especies_id;
    }
}

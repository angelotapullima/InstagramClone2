package bufeotec.com.appvet.Modelo;

public class Sintomas {

    private  String sintomas_id;
    private  String sintomas_nombre;

    public Sintomas() {
    }

    public Sintomas(String sintomas_nombre) {
        this.sintomas_nombre = sintomas_nombre;
    }

    public String getSintomas_id() {
        return sintomas_id;
    }

    public void setSintomas_id(String sintomas_id) {
        this.sintomas_id = sintomas_id;
    }

    public String getSintomas_nombre() {
        return sintomas_nombre;
    }

    public void setSintomas_nombre(String sintomas_nombre) {
        this.sintomas_nombre = sintomas_nombre;
    }
}

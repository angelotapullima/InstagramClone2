package bufeotec.com.appvet.Modelo;

public class SintomaEnfermedades {

    private String sintomasenfermedades_id;
    private String sintomas_id;
    private String enfermedad_id;

    public SintomaEnfermedades() {
    }

    public SintomaEnfermedades(String sintomas_id, String enfermedad_id) {
        this.sintomas_id = sintomas_id;
        this.enfermedad_id = enfermedad_id;
    }

    public String getSintomasenfermedades_id() {
        return sintomasenfermedades_id;
    }

    public void setSintomasenfermedades_id(String sintomasenfermedades_id) {
        this.sintomasenfermedades_id = sintomasenfermedades_id;
    }

    public String getSintomas_id() {
        return sintomas_id;
    }

    public void setSintomas_id(String sintomas_id) {
        this.sintomas_id = sintomas_id;
    }

    public String getEnfermedad_id() {
        return enfermedad_id;
    }

    public void setEnfermedad_id(String enfermedad_id) {
        this.enfermedad_id = enfermedad_id;
    }
}

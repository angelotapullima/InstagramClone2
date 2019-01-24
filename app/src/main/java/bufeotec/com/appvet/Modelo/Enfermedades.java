package bufeotec.com.appvet.Modelo;

public class Enfermedades {

    private String enfermedades_id;
    private String enfermedades_nombre;
    private String especie_id;
    private String enfermedades_descripcion;
    private String enfermedades_tratamiento;
    private String enfermedades_foto;
    private String enfermedades_categorias;

    public Enfermedades() {
    }

    public Enfermedades(String enfermedades_nombre, String especie_id, String enfermedades_descripcion, String enfermedades_tratamiento, String enfermedades_foto, String enfermedades_categorias) {
        this.enfermedades_nombre = enfermedades_nombre;
        this.especie_id = especie_id;
        this.enfermedades_descripcion = enfermedades_descripcion;
        this.enfermedades_tratamiento = enfermedades_tratamiento;
        this.enfermedades_foto = enfermedades_foto;
        this.enfermedades_categorias = enfermedades_categorias;
    }

    public String getEnfermedades_id() {
        return enfermedades_id;
    }

    public void setEnfermedades_id(String enfermedades_id) {
        this.enfermedades_id = enfermedades_id;
    }

    public String getEnfermedades_nombre() {
        return enfermedades_nombre;
    }

    public void setEnfermedades_nombre(String enfermedades_nombre) {
        this.enfermedades_nombre = enfermedades_nombre;
    }

    public String getEspecie_id() {
        return especie_id;
    }

    public void setEspecie_id(String especie_id) {
        this.especie_id = especie_id;
    }

    public String getEnfermedades_descripcion() {
        return enfermedades_descripcion;
    }

    public void setEnfermedades_descripcion(String enfermedades_descripcion) {
        this.enfermedades_descripcion = enfermedades_descripcion;
    }

    public String getEnfermedades_tratamiento() {
        return enfermedades_tratamiento;
    }

    public void setEnfermedades_tratamiento(String enfermedades_tratamiento) {
        this.enfermedades_tratamiento = enfermedades_tratamiento;
    }

    public String getEnfermedades_foto() {
        return enfermedades_foto;
    }

    public void setEnfermedades_foto(String enfermedades_foto) {
        this.enfermedades_foto = enfermedades_foto;
    }

    public String getEnfermedades_categorias() {
        return enfermedades_categorias;
    }

    public void setEnfermedades_categorias(String enfermedades_categorias) {
        this.enfermedades_categorias = enfermedades_categorias;
    }
}

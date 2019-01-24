package bufeotec.com.appvet.Modelo;

public class Ubigeo {

    private String ubigeo_id;
    private String ubigeo_ciudad;
    private String ubigeo_departamento;
    private String ubigeo_provincia;
    private String ubigeo_distrito;

    public Ubigeo() {
    }

    public Ubigeo(String ubigeo_ciudad, String ubigeo_departamento, String ubigeo_provincia, String ubigeo_distrito) {
        this.ubigeo_ciudad = ubigeo_ciudad;
        this.ubigeo_departamento = ubigeo_departamento;
        this.ubigeo_provincia = ubigeo_provincia;
        this.ubigeo_distrito = ubigeo_distrito;
    }

    public String getUbigeo_id() {
        return ubigeo_id;
    }

    public void setUbigeo_id(String ubigeo_id) {
        this.ubigeo_id = ubigeo_id;
    }

    public String getUbigeo_ciudad() {
        return ubigeo_ciudad;
    }

    public void setUbigeo_ciudad(String ubigeo_ciudad) {
        this.ubigeo_ciudad = ubigeo_ciudad;
    }

    public String getUbigeo_departamento() {
        return ubigeo_departamento;
    }

    public void setUbigeo_departamento(String ubigeo_departamento) {
        this.ubigeo_departamento = ubigeo_departamento;
    }

    public String getUbigeo_provincia() {
        return ubigeo_provincia;
    }

    public void setUbigeo_provincia(String ubigeo_provincia) {
        this.ubigeo_provincia = ubigeo_provincia;
    }

    public String getUbigeo_distrito() {
        return ubigeo_distrito;
    }

    public void setUbigeo_distrito(String ubigeo_distrito) {
        this.ubigeo_distrito = ubigeo_distrito;
    }
}

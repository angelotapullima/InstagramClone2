package bufeotec.com.appvet.Modelo;

public class Rol {
    private String rol_id;
    private String rol_nombre;

    public Rol() {
    }

    public Rol(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }

    public String getRol_id() {
        return rol_id;
    }

    public void setRol_id(String rol_id) {
        this.rol_id = rol_id;
    }

    public String getRol_nombre() {
        return rol_nombre;
    }

    public void setRol_nombre(String rol_nombre) {
        this.rol_nombre = rol_nombre;
    }
}

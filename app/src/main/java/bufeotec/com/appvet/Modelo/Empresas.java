package bufeotec.com.appvet.Modelo;

public class Empresas {

    private String empresas_id;
    private String usuario_id;
    private String empresas_nombre;
    private String empresas_foto;
    private String empresas_descripcion;
    private String empresas_direccion;
    private String empresas_valoracion;
    private String empresas_estado;
    private String ubigeo_id;

    public Empresas() {
    }

    public Empresas(String usuario_id, String empresas_nombre, String empresas_foto, String empresas_descripcion, String empresas_direccion, String empresas_valoracion, String empresas_estado, String ubigeo_id) {
        this.usuario_id = usuario_id;
        this.empresas_nombre = empresas_nombre;
        this.empresas_foto = empresas_foto;
        this.empresas_descripcion = empresas_descripcion;
        this.empresas_direccion = empresas_direccion;
        this.empresas_valoracion = empresas_valoracion;
        this.empresas_estado = empresas_estado;
        this.ubigeo_id = ubigeo_id;
    }

    public String getEmpresas_id() {
        return empresas_id;
    }

    public void setEmpresas_id(String empresas_id) {
        this.empresas_id = empresas_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getEmpresas_nombre() {
        return empresas_nombre;
    }

    public void setEmpresas_nombre(String empresas_nombre) {
        this.empresas_nombre = empresas_nombre;
    }

    public String getEmpresas_foto() {
        return empresas_foto;
    }

    public void setEmpresas_foto(String empresas_foto) {
        this.empresas_foto = empresas_foto;
    }

    public String getEmpresas_descripcion() {
        return empresas_descripcion;
    }

    public void setEmpresas_descripcion(String empresas_descripcion) {
        this.empresas_descripcion = empresas_descripcion;
    }

    public String getEmpresas_direccion() {
        return empresas_direccion;
    }

    public void setEmpresas_direccion(String empresas_direccion) {
        this.empresas_direccion = empresas_direccion;
    }

    public String getEmpresas_valoracion() {
        return empresas_valoracion;
    }

    public void setEmpresas_valoracion(String empresas_valoracion) {
        this.empresas_valoracion = empresas_valoracion;
    }

    public String getEmpresas_estado() {
        return empresas_estado;
    }

    public void setEmpresas_estado(String empresas_estado) {
        this.empresas_estado = empresas_estado;
    }

    public String getUbigeo_id() {
        return ubigeo_id;
    }

    public void setUbigeo_id(String ubigeo_id) {
        this.ubigeo_id = ubigeo_id;
    }
}

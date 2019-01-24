package bufeotec.com.appvet.Modelo;

public class Usuario {

    private String usuario_id;
    private String usuario_nombre;
    private String usuario_foto;
    private String usuario_nacimiento;
    private String usuario_sexo;
    private String usuario_frase;
    private String usuario_usuario;
    private String usuario_clave;
    private String usuario_email;
    private String usuario_telefono;
    private String rol_id;
    private String usuario_estado;
    private String usuario_dni;
    private String ubigeo_id;
    private String usuario_codigoverificacion;

    public Usuario() {
    }

    public Usuario(String usuario_id, String usuario_usuario) {
        this.usuario_id = usuario_id;
        this.usuario_usuario = usuario_usuario;
    }

    public Usuario(String usuario_nombre, String usuario_foto, String usuario_nacimiento, String usuario_sexo, String usuario_frase, String usuario_usuario, String usuario_clave, String usuario_email, String usuario_telefono, String rol_id, String usuario_estado, String usuario_dni, String ubigeo_id) {
        this.usuario_nombre = usuario_nombre;
        this.usuario_foto = usuario_foto;
        this.usuario_nacimiento = usuario_nacimiento;
        this.usuario_sexo = usuario_sexo;
        this.usuario_frase = usuario_frase;
        this.usuario_usuario = usuario_usuario;
        this.usuario_clave = usuario_clave;
        this.usuario_email = usuario_email;
        this.usuario_telefono = usuario_telefono;
        this.rol_id = rol_id;
        this.usuario_estado = usuario_estado;
        this.usuario_dni = usuario_dni;
        this.ubigeo_id = ubigeo_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_nombre() {
        return usuario_nombre;
    }

    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }

    public String getUsuario_foto() {
        return usuario_foto;
    }

    public void setUsuario_foto(String usuario_foto) {
        this.usuario_foto = usuario_foto;
    }

    public String getUsuario_nacimiento() {
        return usuario_nacimiento;
    }

    public void setUsuario_nacimiento(String usuario_nacimiento) {
        this.usuario_nacimiento = usuario_nacimiento;
    }

    public String getUsuario_sexo() {
        return usuario_sexo;
    }

    public void setUsuario_sexo(String usuario_sexo) {
        this.usuario_sexo = usuario_sexo;
    }

    public String getUsuario_frase() {
        return usuario_frase;
    }

    public void setUsuario_frase(String usuario_frase) {
        this.usuario_frase = usuario_frase;
    }

    public String getUsuario_usuario() {
        return usuario_usuario;
    }

    public void setUsuario_usuario(String usuario_usuario) {
        this.usuario_usuario = usuario_usuario;
    }

    public String getUsuario_clave() {
        return usuario_clave;
    }

    public void setUsuario_clave(String usuario_clave) {
        this.usuario_clave = usuario_clave;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    public String getUsuario_telefono() {
        return usuario_telefono;
    }

    public void setUsuario_telefono(String usuario_telefono) {
        this.usuario_telefono = usuario_telefono;
    }

    public String getRol_id() {
        return rol_id;
    }

    public void setRol_id(String rol_id) {
        this.rol_id = rol_id;
    }

    public String getUsuario_estado() {
        return usuario_estado;
    }

    public void setUsuario_estado(String usuario_estado) {
        this.usuario_estado = usuario_estado;
    }

    public String getUsuario_dni() {
        return usuario_dni;
    }

    public void setUsuario_dni(String usuario_dni) {
        this.usuario_dni = usuario_dni;
    }

    public String getUbigeo_id() {
        return ubigeo_id;
    }

    public void setUbigeo_id(String ubigeo_id) {
        this.ubigeo_id = ubigeo_id;
    }


    public String getUsuario_codigoverificacion() {
        return usuario_codigoverificacion;
    }

    public void setUsuario_codigoverificacion(String usuario_codigoverificacion) {
        this.usuario_codigoverificacion = usuario_codigoverificacion;
    }
}

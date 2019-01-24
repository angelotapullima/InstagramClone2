package bufeotec.com.appvet.Modelo;

public class Mascota {

    private String mascota_id;
    private String mascota_nombre;
    private String mascota_codigo;
    private String mascota_raza_id1;
    private String mascota_raza_id2;
    private String mascota_nacimiento;
    private String mascota_foto;
    private String mascota_descripcion;
    private String mascota_estado;
    private String usuario_id;
    private String mascota_alergias;
    private String mascota_esterilizacion;
    private String mascota_sexo;


    public Mascota() {
    }

    public Mascota(String mascota_nombre, String mascota_codigo, String mascota_raza_id1, String mascota_raza_id2, String mascota_nacimiento, String mascota_foto, String mascota_descripcion, String mascota_estado, String usuario_id, String mascota_alergias, String mascota_esterilizacion, String mascota_sexo) {

        this.mascota_nombre = mascota_nombre;
        this.mascota_codigo = mascota_codigo;
        this.mascota_raza_id1 = mascota_raza_id1;
        this.mascota_raza_id2 = mascota_raza_id2;
        this.mascota_nacimiento = mascota_nacimiento;
        this.mascota_foto = mascota_foto;
        this.mascota_descripcion = mascota_descripcion;
        this.mascota_estado = mascota_estado;
        this.usuario_id = usuario_id;
        this.mascota_alergias = mascota_alergias;
        this.mascota_esterilizacion = mascota_esterilizacion;
        this.mascota_sexo = mascota_sexo;
    }

    public String getMascota_sexo() {
        return mascota_sexo;
    }

    public void setMascota_sexo(String mascota_sexo) {
        this.mascota_sexo = mascota_sexo;
    }

    public String getMascota_id() {
        return mascota_id;
    }

    public void setMascota_id(String mascota_id) {
        this.mascota_id = mascota_id;
    }

    public String getMascota_nombre() {
        return mascota_nombre;
    }

    public void setMascota_nombre(String mascota_nombre) {
        this.mascota_nombre = mascota_nombre;
    }

    public String getMascota_codigo() {
        return mascota_codigo;
    }

    public void setMascota_codigo(String mascota_codigo) {
        this.mascota_codigo = mascota_codigo;
    }

    public String getMascota_raza_id1() {
        return mascota_raza_id1;
    }

    public void setMascota_raza_id1(String mascota_raza_id1) {
        this.mascota_raza_id1 = mascota_raza_id1;
    }

    public String getMascota_raza_id2() {
        return mascota_raza_id2;
    }

    public void setMascota_raza_id2(String mascota_raza_id2) {
        this.mascota_raza_id2 = mascota_raza_id2;
    }

    public String getMascota_nacimiento() {
        return mascota_nacimiento;
    }

    public void setMascota_nacimiento(String mascota_nacimiento) {
        this.mascota_nacimiento = mascota_nacimiento;
    }

    public String getMascota_foto() {
        return mascota_foto;
    }

    public void setMascota_foto(String mascota_foto) {
        this.mascota_foto = mascota_foto;
    }

    public String getMascota_descripcion() {
        return mascota_descripcion;
    }

    public void setMascota_descripcion(String mascota_descripcion) {
        this.mascota_descripcion = mascota_descripcion;
    }

    public String getMascota_estado() {
        return mascota_estado;
    }

    public void setMascota_estado(String mascota_estado) {
        this.mascota_estado = mascota_estado;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getMascota_alergias() {
        return mascota_alergias;
    }

    public void setMascota_alergias(String mascota_alergias) {
        this.mascota_alergias = mascota_alergias;
    }

    public String getMascota_esterilizacion() {
        return mascota_esterilizacion;
    }

    public void setMascota_esterilizacion(String mascota_esterilizacion) {
        this.mascota_esterilizacion = mascota_esterilizacion;
    }
}

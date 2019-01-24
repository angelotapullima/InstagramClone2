package bufeotec.com.appvet.Modelo;

public class Tips {

    private String tips_id;
    private String usuario_id;
    private String tips_titulo;
    private String tips_foto;
    private String tips_descripcion;
    private String tips_fecha;
    private String tips_estado;

    public Tips() {
    }

    public Tips(String usuario_id, String tips_titulo, String tips_foto, String tips_descripcion, String tips_fecha, String tips_estado) {
        this.usuario_id = usuario_id;
        this.tips_titulo = tips_titulo;
        this.tips_foto = tips_foto;
        this.tips_descripcion = tips_descripcion;
        this.tips_fecha = tips_fecha;
        this.tips_estado = tips_estado;
    }

    public String getTips_id() {
        return tips_id;
    }

    public void setTips_id(String tips_id) {
        this.tips_id = tips_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getTips_titulo() {
        return tips_titulo;
    }

    public void setTips_titulo(String tips_titulo) {
        this.tips_titulo = tips_titulo;
    }

    public String getTips_foto() {
        return tips_foto;
    }

    public void setTips_foto(String tips_foto) {
        this.tips_foto = tips_foto;
    }

    public String getTips_descripcion() {
        return tips_descripcion;
    }

    public void setTips_descripcion(String tips_descripcion) {
        this.tips_descripcion = tips_descripcion;
    }

    public String getTips_fecha() {
        return tips_fecha;
    }

    public void setTips_fecha(String tips_fecha) {
        this.tips_fecha = tips_fecha;
    }

    public String getTips_estado() {
        return tips_estado;
    }

    public void setTips_estado(String tips_estado) {
        this.tips_estado = tips_estado;
    }
}

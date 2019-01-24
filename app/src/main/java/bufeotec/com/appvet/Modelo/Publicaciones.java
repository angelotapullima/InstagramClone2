package bufeotec.com.appvet.Modelo;

public class Publicaciones {

    private String publicaciones_id;
    private String usuario_id;
    private String publicaciones_titulo;
    private String publicaciones_descripcion;
    private String publicaciones_foto;
    private String publicaciones_fecha;
    private String publicaciones_tipo;
    private String publicaciones_categoria;
    private String publicaciones_estado;

    public Publicaciones() {
    }

    public Publicaciones(String usuario_id, String publicaciones_titulo, String publicaciones_descripcion, String publicaciones_foto, String publicaciones_fecha, String publicaciones_tipo, String publicaciones_categoria, String publicaciones_estado) {
        this.usuario_id = usuario_id;
        this.publicaciones_titulo = publicaciones_titulo;
        this.publicaciones_descripcion = publicaciones_descripcion;
        this.publicaciones_foto = publicaciones_foto;
        this.publicaciones_fecha = publicaciones_fecha;
        this.publicaciones_tipo = publicaciones_tipo;
        this.publicaciones_categoria = publicaciones_categoria;
        this.publicaciones_estado = publicaciones_estado;
    }

    public String getPublicaciones_id() {
        return publicaciones_id;
    }

    public void setPublicaciones_id(String publicaciones_id) {
        this.publicaciones_id = publicaciones_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getPublicaciones_titulo() {
        return publicaciones_titulo;
    }

    public void setPublicaciones_titulo(String publicaciones_titulo) {
        this.publicaciones_titulo = publicaciones_titulo;
    }

    public String getPublicaciones_descripcion() {
        return publicaciones_descripcion;
    }

    public void setPublicaciones_descripcion(String publicaciones_descripcion) {
        this.publicaciones_descripcion = publicaciones_descripcion;
    }

    public String getPublicaciones_foto() {
        return publicaciones_foto;
    }

    public void setPublicaciones_foto(String publicaciones_foto) {
        this.publicaciones_foto = publicaciones_foto;
    }

    public String getPublicaciones_fecha() {
        return publicaciones_fecha;
    }

    public void setPublicaciones_fecha(String publicaciones_fecha) {
        this.publicaciones_fecha = publicaciones_fecha;
    }

    public String getPublicaciones_tipo() {
        return publicaciones_tipo;
    }

    public void setPublicaciones_tipo(String publicaciones_tipo) {
        this.publicaciones_tipo = publicaciones_tipo;
    }

    public String getPublicaciones_categoria() {
        return publicaciones_categoria;
    }

    public void setPublicaciones_categoria(String publicaciones_categoria) {
        this.publicaciones_categoria = publicaciones_categoria;
    }

    public String getPublicaciones_estado() {
        return publicaciones_estado;
    }

    public void setPublicaciones_estado(String publicaciones_estado) {
        this.publicaciones_estado = publicaciones_estado;
    }
}

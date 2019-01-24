package bufeotec.com.appvet.Modelo;

public class LikePublicacion {

    private String likepublicacion_id;
    private String usuario_id;
    private String publicacion_id;

    public LikePublicacion() {
    }

    public LikePublicacion(String usuario_id, String publicacion_id) {
        this.usuario_id = usuario_id;
        this.publicacion_id = publicacion_id;
    }

    public String getLikepublicacion_id() {
        return likepublicacion_id;
    }

    public void setLikepublicacion_id(String likepublicacion_id) {
        this.likepublicacion_id = likepublicacion_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getPublicacion_id() {
        return publicacion_id;
    }

    public void setPublicacion_id(String publicacion_id) {
        this.publicacion_id = publicacion_id;
    }
}

package bufeotec.com.appvet.Modelo;

public class LikeEmpresas {

    private String likeempresas_id;
    private String empresas_id;
    private String usuario_id;


    public LikeEmpresas() {
    }

    public LikeEmpresas(String empresas_id, String usuario_id) {
        this.empresas_id = empresas_id;
        this.usuario_id = usuario_id;
    }

    public String getLikeempresas_id() {
        return likeempresas_id;
    }

    public void setLikeempresas_id(String likeempresas_id) {
        this.likeempresas_id = likeempresas_id;
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
}

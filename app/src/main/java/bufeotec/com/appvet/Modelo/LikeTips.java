package bufeotec.com.appvet.Modelo;

public class LikeTips {

    private String liketips_id;
    private String tips_id;
    private String usuario_id;

    public LikeTips() {
    }

    public LikeTips(String tips_id, String usuario_id) {
        this.tips_id = tips_id;
        this.usuario_id = usuario_id;
    }

    public String getLiketips_id() {
        return liketips_id;
    }

    public void setLiketips_id(String liketips_id) {
        this.liketips_id = liketips_id;
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
}

package bufeotec.com.appvet.Modelo;

public class HitorialFicha {

    private String historialficha_id;
    private String mascota_id;
    private String historialficha_tratamiento;
    private String historialficha_fecha;
    private String historialficha_diagnostico;
    private String historialficha_sintomas;
    private String historialficha_nota;
    private String historialficha_motivoconsulta;
    private String historialficha_recordatorio;
    private String historialficha_fecharecordatorio;


    public HitorialFicha() {
    }

    public HitorialFicha(String mascota_id, String historialficha_tratamiento, String historialficha_fecha, String historialficha_diagnostico, String historialficha_sintomas, String historialficha_nota, String historialficha_motivoconsulta, String historialficha_recordatorio, String historialficha_fecharecordatorio) {
        this.mascota_id = mascota_id;
        this.historialficha_tratamiento = historialficha_tratamiento;
        this.historialficha_fecha = historialficha_fecha;
        this.historialficha_diagnostico = historialficha_diagnostico;
        this.historialficha_sintomas = historialficha_sintomas;
        this.historialficha_nota = historialficha_nota;
        this.historialficha_motivoconsulta = historialficha_motivoconsulta;
        this.historialficha_recordatorio = historialficha_recordatorio;
        this.historialficha_fecharecordatorio = historialficha_fecharecordatorio;
    }

    public String getHistorialficha_id() {
        return historialficha_id;
    }

    public void setHistorialficha_id(String historialficha_id) {
        this.historialficha_id = historialficha_id;
    }

    public String getMascota_id() {
        return mascota_id;
    }

    public void setMascota_id(String mascota_id) {
        this.mascota_id = mascota_id;
    }

    public String getHistorialficha_tratamiento() {
        return historialficha_tratamiento;
    }

    public void setHistorialficha_tratamiento(String historialficha_tratamiento) {
        this.historialficha_tratamiento = historialficha_tratamiento;
    }

    public String getHistorialficha_fecha() {
        return historialficha_fecha;
    }

    public void setHistorialficha_fecha(String historialficha_fecha) {
        this.historialficha_fecha = historialficha_fecha;
    }

    public String getHistorialficha_diagnostico() {
        return historialficha_diagnostico;
    }

    public void setHistorialficha_diagnostico(String historialficha_diagnostico) {
        this.historialficha_diagnostico = historialficha_diagnostico;
    }

    public String getHistorialficha_sintomas() {
        return historialficha_sintomas;
    }

    public void setHistorialficha_sintomas(String historialficha_sintomas) {
        this.historialficha_sintomas = historialficha_sintomas;
    }

    public String getHistorialficha_nota() {
        return historialficha_nota;
    }

    public void setHistorialficha_nota(String historialficha_nota) {
        this.historialficha_nota = historialficha_nota;
    }

    public String getHistorialficha_motivoconsulta() {
        return historialficha_motivoconsulta;
    }

    public void setHistorialficha_motivoconsulta(String historialficha_motivoconsulta) {
        this.historialficha_motivoconsulta = historialficha_motivoconsulta;
    }

    public String getHistorialficha_recordatorio() {
        return historialficha_recordatorio;
    }

    public void setHistorialficha_recordatorio(String historialficha_recordatorio) {
        this.historialficha_recordatorio = historialficha_recordatorio;
    }

    public String getHistorialficha_fecharecordatorio() {
        return historialficha_fecharecordatorio;
    }

    public void setHistorialficha_fecharecordatorio(String historialficha_fecharecordatorio) {
        this.historialficha_fecharecordatorio = historialficha_fecharecordatorio;
    }
}

package bufeotec.com.appvet.WebService;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import bufeotec.com.appvet.Activity.Registrarse;
import bufeotec.com.appvet.Modelo.Mascota;
import bufeotec.com.appvet.Modelo.Usuario;

public class DataConnection extends AppCompatActivity {

    public String funcion,idusaurio,texto,jsondatos;
    public String parametros,respuesta,cargarDatos;
    boolean mensajeprogres,mensaje;

    Activity context;

    Usuario obj;
    Mascota mascota;

    JSONObject json_data;


    public static  final String IP= "www.guabba.com/appvet";

    public DataConnection(){

    }

    //Asignamos valores a traves del constructor (Multifuncion Usuario-Listados tablas)
    public DataConnection(Activity context,String funcion,Usuario obj,boolean mensajeprogres){
        this.context = context;
        this.funcion = funcion;
        this.obj = obj;
        this.mensajeprogres = mensajeprogres;

        new GetAndSet().execute();

        /*if(isOnLine()){
            new GetAndSet().execute();
        }else {
            Toast.makeText(context,"Sin acceso a Internet",Toast.LENGTH_LONG).show();
        }*/


    }


    //Registro de Mascota
    public DataConnection(Activity context, String funcion, Mascota mascota, boolean mensajeprogres){
        this.context = context;
        this.funcion = funcion;
        this.mascota = mascota;
        this.mensajeprogres = mensajeprogres;

        new GetAndSet().execute();

        /*if(isOnLine()){
            new GetAndSet().execute();
        }else {
            Toast.makeText(context,"Sin acceso a Internet",Toast.LENGTH_LONG).show();
        }*/


    }




    //Enviamos los datos al webservice y devuelve un valor string-respuesta
    private  String obtenerDatos(){
        StringBuffer response = null;
        try {

            URL url = new URL("http://"+IP+"/index.php?c=Cliente&a=registrar");


            if(funcion.equals("loginUsuario")){
                parametros = "usuario=" + URLEncoder.encode(obj.getUsuario_usuario(),"UTF-8")
                        + "&clave=" + URLEncoder.encode(obj.getUsuario_clave(),"UTF-8");

                url = new URL("http://"+IP+"/index.php?c=Usuario&a=loguearse&key_mobile=123456asdfgh");
            }
            if(funcion.equals("registrarse")){
                parametros = "nombre=" + URLEncoder.encode(obj.getUsuario_nombre(),"UTF-8")
                        + "&nacimiento=" + URLEncoder.encode(obj.getUsuario_nacimiento(),"UTF-8")
                        + "&foto=" + URLEncoder.encode(obj.getUsuario_foto(),"UTF-8")
                        + "&sexo=" + URLEncoder.encode(obj.getUsuario_sexo(),"UTF-8")
                        + "&frase=" + URLEncoder.encode(obj.getUsuario_frase(),"UTF-8")
                        + "&usuario=" + URLEncoder.encode(obj.getUsuario_usuario(),"UTF-8")
                        + "&clave=" + URLEncoder.encode(obj.getUsuario_clave(),"UTF-8")
                        + "&email=" + URLEncoder.encode(obj.getUsuario_email(),"UTF-8")
                        + "&dni=" + URLEncoder.encode(obj.getUsuario_dni(),"UTF-8")
                        + "&telefono=" + URLEncoder.encode(obj.getUsuario_telefono(),"UTF-8")
                        + "&codigoverificacion=" + URLEncoder.encode(obj.getUsuario_codigoverificacion(),"UTF-8")
                        + "&rol_id=" + URLEncoder.encode(obj.getRol_id(),"UTF-8")
                        + "&ubigeo_id=" + URLEncoder.encode(obj.getUbigeo_id(),"UTF-8");

                url = new URL("http://"+IP+"/index.php?c=Usuario&a=registrar&key_mobile=123456asdfgh");

            }if(funcion.equals("registrarMascota")){
                parametros = "raza_id1=" + URLEncoder.encode(mascota.getMascota_raza_id1(),"UTF-8")
                        + "&raza_id2=" + URLEncoder.encode(mascota.getMascota_raza_id2(),"UTF-8")
                        + "&usuario_id=" + URLEncoder.encode("1","UTF-8")
                        + "&nombre=" + URLEncoder.encode(mascota.getMascota_nombre(),"UTF-8")
                        + "&sexo=" + URLEncoder.encode(mascota.getMascota_sexo(),"UTF-8")
                        + "&nacimiento=" + URLEncoder.encode(mascota.getMascota_nacimiento(),"UTF-8")
                        + "&foto=" + URLEncoder.encode("perro.png","UTF-8")
                        + "&descripcion=" + URLEncoder.encode(mascota.getMascota_descripcion(),"UTF-8")
                        + "&alergias=" + URLEncoder.encode(mascota.getMascota_alergias(),"UTF-8")
                        + "&esterilizacion=" + URLEncoder.encode(mascota.getMascota_esterilizacion(),"UTF-8")
                        + "&codigo=" + URLEncoder.encode("123456789","UTF-8");

                url = new URL("http://"+IP+"/index.php?c=Mascota&a=registrar&key_mobile=123456asdfgh");
            }

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Accept-Language","en-US,en;q=0.5");
            con.setDoOutput(true);

            con.setFixedLengthStreamingMode(parametros.getBytes().length);

            con.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            OutputStream out = new BufferedOutputStream(con.getOutputStream());
            out.write(parametros.getBytes());
            out.flush();
            out.close();


            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine=in.readLine()) !=null){
                response.append(inputLine);
            }
            in.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        return response.toString();

    }

    String valorcodigo,rol;

    private  boolean filtrardDatos(){

        cargarDatos = obtenerDatos();
        try {

            if(!(cargarDatos.equalsIgnoreCase("")  )){


                json_data = new JSONObject(cargarDatos);

                if(funcion.equals("loginUsuario")){

                    //if(cargarDatos.equalsIgnoreCase("{\"results\":[]}")){


                    JSONArray resultJSON = json_data.getJSONArray("results");
                    JSONObject jsonNodev = resultJSON.getJSONObject(0);
                    valorcodigo = jsonNodev.optString("valor");
                    rol = jsonNodev.optString("rol");

                    if(valorcodigo.equalsIgnoreCase("2") || valorcodigo.equalsIgnoreCase("3")){
                        respuesta = "false";
                        obj = null;
                    }else if(rol.equalsIgnoreCase("3")) {
                        respuesta = "false";
                        obj = null;
                    }else{

                        respuesta = "true";
                        //respuesta = valorcodigo;


                        //resultJSON = json_data.getJSONArray("results");
                        int count = resultJSON.length();

                        for (int i = 0; i < count;i++){

                            JSONObject jsonNode = resultJSON.getJSONObject(i);

                            obj.setUsuario_id(jsonNode.optString("idusuario"));
                            obj.setUsuario_usuario(obj.getUsuario_usuario());

                            //Nuevo
                            obj = new Usuario(obj.getUsuario_id(),obj.getUsuario_usuario());
                        }
                    }

                }if(funcion.equals("registrarse")){

                    JSONArray resultJSON = json_data.getJSONArray("results");
                    JSONObject jsonNodev = resultJSON.getJSONObject(0);
                    valorcodigo = jsonNodev.optString("valor");


                    if(valorcodigo.equalsIgnoreCase("1")){
                        respuesta = "1";
                    }else if(valorcodigo.equalsIgnoreCase("2")) {
                        respuesta = "2";
                    }else {
                        respuesta = "3";
                    }


                }if(funcion.equals("registrarMascota")){

                    JSONArray resultJSON = json_data.getJSONArray("results");
                    JSONObject jsonNodev = resultJSON.getJSONObject(0);
                    valorcodigo = jsonNodev.optString("valor");


                    if(valorcodigo.equalsIgnoreCase("1")){
                        respuesta = "1";
                    }else if(valorcodigo.equalsIgnoreCase("2")) {
                        respuesta = "2";
                    }else {
                        respuesta = "3";
                    }


                }

                return true;
            }
        }catch (JSONException e){
            e.printStackTrace();
        }


        return false;
    }

    public boolean isOnLine(){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo != null && networkInfo.isConnectedOrConnecting()){
            return  true;
        }else {
            return false;
        }

    }

    class GetAndSet extends AsyncTask<String,String,String > {


        String valor = "";
        ProgressDialog loading;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            if(mensajeprogres){
                loading = ProgressDialog.show(context, "AppVet", "Por favor espere...", false, false);
            }

        }

        @Override
        protected  String doInBackground(String... params) {

            try{
                if(filtrardDatos()){

                    actividad();
                }
            }catch (NullPointerException e){
                valor = "Problema con la conexion a internet";
            }catch (RuntimeException e){
                valor = "Problema con la conexion a internet";
            }
            return valor;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            if(mensajeprogres){
                loading.dismiss();
            }
            if(!valor.equals("")){
                Toast.makeText(context, valor, Toast.LENGTH_LONG).show();
            }

        }
    }


    private  void actividad(){

        if(funcion.equals("loginUsuario")){

            if(respuesta.equals("true")){

                /*
                Intent intent = new Intent(context, PrincipalAbono.class);
                intent.putExtra("idusuario",obj.getId());
                intent.putExtra("usuario",obj.getUsuario());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);  */

                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        //Toast.makeText(context, "Ingresa despues", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, Registrarse.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        context.startActivity(intent);

                    }
                });
            }else {
                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(valorcodigo.equalsIgnoreCase("2")){
                            Toast.makeText(context, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                        }
                        else if(valorcodigo.equalsIgnoreCase("3")){
                            Toast.makeText(context, "Cuenta desactivada", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(context, "No tiene permisos", Toast.LENGTH_SHORT).show();
                        }

                    }
                });


            }
        }if(funcion.equals("registrarse")){

            if(respuesta.equals("1")){


                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Usuario registrado", Toast.LENGTH_SHORT).show();
                    }
                });

            }else if(respuesta.equals("3")){

                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "DNI ya existe", Toast.LENGTH_SHORT).show();

                    }
                });

            } else{
                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Vuelva a intentarlo", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        }  if(funcion.equals("registrarMascota")){

            if(respuesta.equals("1")){


                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Mascota registrada", Toast.LENGTH_SHORT).show();
                    }
                });

            }else if(respuesta.equals("3")){

                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Mascota ya existe", Toast.LENGTH_SHORT).show();

                    }
                });

            } else{
                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(context, "Vuelva a intentarlo", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        }


    }

    public Usuario getUsuario(){
        return obj;
    }

}

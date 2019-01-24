package bufeotec.com.appvet.Activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import bufeotec.com.appvet.Modelo.Usuario;
import bufeotec.com.appvet.R;
import bufeotec.com.appvet.WebService.DataConnection;

public class Registrarse extends AppCompatActivity {

    AutoCompleteTextView act_nombreUsuario,act_emailUsuario,act_telefonoUsuario,act_dniUsuario,act_UsuarioUsuario,act_codVerificacionUsuario;
    TextView txt_fechaNacimientoUsuario;
    Spinner spn_sexo,spn_ciudad,spn_distrito;
    EditText edt_clave,edt_confirmarClave;
    CheckBox cbx_veterinario;
    TextInputLayout til_codVerificacionUsuario;
    Button btn_registrar;

    public Usuario obj;
    DataConnection dc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);






        act_nombreUsuario = findViewById(R.id.act_nombreUsuario);
        act_emailUsuario = findViewById(R.id.act_emailUsuario);
        act_telefonoUsuario = findViewById(R.id.act_telefonoUsuario);
        act_dniUsuario = findViewById(R.id.act_dniUsuario);
        act_UsuarioUsuario = findViewById(R.id.act_UsuarioUsuario);
        act_codVerificacionUsuario = findViewById(R.id.act_codVerificacionUsuario);
        txt_fechaNacimientoUsuario = findViewById(R.id.txt_fechaNacimientoUsuario);
        spn_sexo = findViewById(R.id.spn_sexo);
        spn_ciudad = findViewById(R.id.spn_ciudad);
        spn_distrito = findViewById(R.id.spn_distrito);
        edt_clave = findViewById(R.id.edt_clave);
        edt_confirmarClave = findViewById(R.id.edt_confirmarClave);

        cbx_veterinario = findViewById(R.id.cbx_veterinario);
        til_codVerificacionUsuario = findViewById(R.id.til_codVerificacionUsuario);
        btn_registrar = findViewById(R.id.btn_registrar);


        cbx_veterinario.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    til_codVerificacionUsuario.setVisibility(View.VISIBLE);
                }else{
                    til_codVerificacionUsuario.setVisibility(View.GONE);
                }
            }
        });




        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !(act_nombreUsuario.getText().toString().isEmpty()) && !(act_emailUsuario.getText().toString().isEmpty()) && !(act_emailUsuario.getText().toString().isEmpty())  && !(act_dniUsuario.getText().toString().isEmpty())  && !(act_UsuarioUsuario.getText().toString().isEmpty())  && !(act_UsuarioUsuario.getText().toString().isEmpty())  && !(edt_clave.getText().toString().isEmpty()) && !(edt_confirmarClave.getText().toString().isEmpty())){

                    if(edt_clave.getText().toString().equals(edt_confirmarClave.getText().toString())){
                        obj = new Usuario();
                        if(cbx_veterinario.isChecked() && !(act_emailUsuario.getText().toString().isEmpty()) ){
                            obj.setUsuario_codigoverificacion(act_codVerificacionUsuario.getText().toString());
                        }else{
                            obj.setUsuario_codigoverificacion("");
                        }

                        obj.setUsuario_nombre(act_nombreUsuario.getText().toString());
                        obj.setUsuario_nacimiento(txt_fechaNacimientoUsuario.getText().toString());
                        obj.setUsuario_foto("perfil.png");
                        obj.setUsuario_sexo(spn_sexo.getSelectedItem().toString());
                        obj.setUsuario_frase("");
                        obj.setUsuario_usuario(act_UsuarioUsuario.getText().toString());
                        obj.setUsuario_clave(edt_clave.getText().toString());
                        obj.setUsuario_email(act_emailUsuario.getText().toString());
                        obj.setUsuario_dni(act_dniUsuario.getText().toString());
                        obj.setUsuario_telefono(act_telefonoUsuario.getText().toString());
                        obj.setRol_id("1");
                        obj.setUbigeo_id("1");


                        dc = new DataConnection(Registrarse.this,"registrarse",obj,true);

                    }else{
                        Toast.makeText(getApplicationContext(), "Las claves no coinciden", Toast.LENGTH_LONG).show();
                    }

                }else {
                    Toast.makeText(getApplicationContext(), "Lllene los campos", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}

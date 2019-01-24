package bufeotec.com.appvet.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import bufeotec.com.appvet.Modelo.Usuario;
import bufeotec.com.appvet.R;
import bufeotec.com.appvet.WebService.DataConnection;

public class Login extends AppCompatActivity {

    EditText edt_password;
    Button btn_login;
    TextView txt_resgistrate;

    AutoCompleteTextView act_usuario;

    public Usuario obj;
    DataConnection dc;
    public static Activity activity;

    ArrayList<Usuario> array;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        act_usuario = findViewById(R.id.act_usuario);
        btn_login = findViewById(R.id.btn_login);
        edt_password = findViewById(R.id.edt_password);
        txt_resgistrate = findViewById(R.id.txt_resgistrate);


        txt_resgistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Registrarse.class);
                startActivity(intent);
            }
        });



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !(act_usuario.getText().toString().isEmpty()) && !(edt_password.getText().toString().isEmpty())){

                    obj = new Usuario();
                    obj.setUsuario_usuario(act_usuario.getText().toString());
                    obj.setUsuario_clave(edt_password.getText().toString());

                    dc = new DataConnection(Login.this,"loginUsuario",obj,true);
                }else {
                    Toast.makeText(getApplicationContext(), "Lllene los campos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

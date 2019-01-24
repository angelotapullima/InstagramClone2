package bufeotec.com.appvet.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import bufeotec.com.appvet.Modelo.Mascota;
import bufeotec.com.appvet.R;
import bufeotec.com.appvet.WebService.DataConnection;

public class RegistroMascota extends AppCompatActivity {


    AutoCompleteTextView act_nombreMascota,act_descripcionMascota,act_AlergiasnMascota;
    CheckBox cbx_cruzado;
    Spinner spn_raza,spn_raza2,spn_sexo,spn_esterilizacion;
    Button btn_registrar;
    TextView txt_fechaNacimientoMascota;
    LinearLayout lny_Raza2;


    DataConnection dc;
    Mascota obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_mascota);

        act_nombreMascota = findViewById(R.id.act_nombreMascota);
        act_descripcionMascota = findViewById(R.id.act_descripcionMascota);
        act_AlergiasnMascota = findViewById(R.id.act_AlergiasnMascota);
        cbx_cruzado = findViewById(R.id.cbx_cruzado);
        spn_raza = findViewById(R.id.spn_raza);
        spn_raza2 = findViewById(R.id.spn_raza2);
        spn_sexo = findViewById(R.id.spn_sexo);
        spn_esterilizacion = findViewById(R.id.spn_esterilizacion);
        btn_registrar = findViewById(R.id.btn_registrar);
        txt_fechaNacimientoMascota = findViewById(R.id.txt_fechaNacimientoMascota);

        lny_Raza2 = findViewById(R.id.lny_Raza2);

        cbx_cruzado.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    lny_Raza2.setVisibility(View.VISIBLE);
                }else{
                    lny_Raza2.setVisibility(View.GONE);
                }
            }
        });



        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !(act_nombreMascota.getText().toString().isEmpty())){

                    obj = new Mascota();


                    obj.setMascota_nombre(act_nombreMascota.getText().toString());
                    obj.setMascota_descripcion(act_descripcionMascota.getText().toString());
                    obj.setMascota_alergias(act_AlergiasnMascota.getText().toString());
                    obj.setMascota_raza_id1("1");
                    obj.setMascota_raza_id2("2");
                    obj.setMascota_sexo(spn_sexo.getSelectedItem().toString());
                    obj.setMascota_esterilizacion(spn_esterilizacion.getSelectedItem().toString().equals("SI")  ?  "1" : "0");
                    obj.setMascota_nacimiento(txt_fechaNacimientoMascota.getText().toString());



                    dc = new DataConnection(RegistroMascota.this,"registrarMascota",obj,true);

                }else {
                    Toast.makeText(getApplicationContext(), "Lllene los campos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

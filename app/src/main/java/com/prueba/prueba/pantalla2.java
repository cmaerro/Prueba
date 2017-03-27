package com.prueba.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pantalla2 extends AppCompatActivity {
    private TextView txtUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        txtUsuario = (TextView)findViewById(R.id.txtUsu);
        Bundle bundle = this.getIntent().getExtras();
        if (bundle.getString("TEXTO").trim().isEmpty()){
            txtUsuario.setText("Ha ingresado un mensaje vacío.. ");
        }
        else {
            txtUsuario.setText("Su texto es:  " + bundle.getString("TEXTO"));
        }

    }
}

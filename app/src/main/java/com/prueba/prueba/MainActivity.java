package com.prueba.prueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNombre;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = (Button)findViewById(R.id.button);
        txtNombre = (EditText)findViewById(R.id.editText);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sig = new Intent(MainActivity.this,pantalla2.class);
                Bundle b = new Bundle();
                b.putString("TEXTO", txtNombre.getText().toString());
                sig.putExtras(b);
                startActivity(sig);

            }
        });
    }
}

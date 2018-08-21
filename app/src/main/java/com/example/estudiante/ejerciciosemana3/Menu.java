package com.example.estudiante.ejerciciosemana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intento = getIntent();
        usuario = intento.getStringExtra( "usuario" );

        TextView t = findViewById(R.id.tv_user_name);
        t.setText(usuario);

    }
}

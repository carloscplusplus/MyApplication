package com.uso.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Declaracion de variables
    private Button btnNuevo;
    private Button btnLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar los objetos
        this.btnNuevo = (Button) findViewById(R.id.btn1);
        this.btnLista = (Button) findViewById(R.id.bntLista);

        //Crear los listener para los botones
        this.btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciamos la nueva activity
                Intent nuevaActivity = new Intent(MainActivity.this, Estudiante.class);
                startActivity(nuevaActivity);
            }
        });
        this.btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Iniciamos la nueva Activity
                Intent nuevaActivity = new Intent(MainActivity.this, Estudiante.class);
                startActivity(nuevaActivity);
            }
        });
    }

}

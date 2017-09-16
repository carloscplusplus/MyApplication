package com.uso.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Carlos on 16/09/2017.
 */

public class EstudianteActivity extends AppCompatActivity{
    //declaracion de variables

    private EditText txtNombre,txtCodigo, txtMateria, txtPrimerP, txtSegundoP, txtTercerP;

    private Button btnGuardar;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        //inicializando variables
        txtNombre   = (EditText) findViewById(R.id.txtNombre);
        txtCodigo   = (EditText) findViewById(R.id.txtCodigo);
        txtMateria = (EditText) findViewById(R.id.txtMateria);
        txtPrimerP = (EditText) findViewById(R.id.txtPrimerP);
        txtSegundoP = (EditText) findViewById(R.id.txtSegundoP);
        txtTercerP = (EditText) findViewById(R.id.txtTercerP);
        btnGuardar  = (Button  ) findViewById(R.id.btnAgregarEstudiante);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Estudiante estudiante = new Estudiante(
                        txtNombre.getText().toString(),
                        txtCodigo.getText().toString(),
                        txtMateria.getText().toString(),
                        Double.parseDouble(txtPrimerP.getText().toString()),
                        Double.parseDouble(txtSegundoP.getText().toString()),
                        Double.parseDouble(txtTercerP.getText().toString())
                );
                Intent intent = new Intent();
                intent.putExtra("EST", estudiante);
                setResult(Activity.RESULT_OK, intent);
            }
        });
    }
}

package com.uso.myapplication;

import android.widget.ArrayAdapter;

import android.content.Context;

import android.support.annotation.NonNull;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;

import android.widget.TextView;


import java.util.List;

/**
 * Created by Carlos on 16/09/2017.
 */

public class AdaptadorEstudiante extends ArrayAdapter<Estudiante>{

        //TODO constructor con 2 parametros : el contexto y la lista de objetos (Contacto)
        public AdaptadorEstudiante(Context context, List<Estudiante> objects) {
            super(context, 0, objects);
        }
        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Obteniendo el dato
            Estudiante estudiante = getItem(position);
            //TODO inicializando el layout correspondiente al item (Contacto)
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante, parent, false);
            }
            TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre);
            TextView lblCodigo = (TextView) convertView.findViewById(R.id.lblCodigo);
            TextView lblMateria = (TextView) convertView.findViewById(R.id.lblMateria);
            TextView lblParcial1 = (TextView) convertView.findViewById(R.id.txtPrimerP);
            TextView lblParcial2 = (TextView) convertView.findViewById(R.id.txtSegundoP);
            TextView lblParcial3 = (TextView) convertView.findViewById(R.id.txtTercerP);

            // mostrar los datos
            lblNombre.setText(estudiante.nombre);
            lblCodigo.setText(estudiante.codigo);
            lblMateria.setText(estudiante.materia);
            lblParcial1.setText(""+ estudiante.parcial1);
            lblParcial2.setText(""+ estudiante.parcial2);
            lblParcial3.setText(""+ estudiante.parcial3);

            // Return la convertView ya con los datos
            return convertView;
        }
    }

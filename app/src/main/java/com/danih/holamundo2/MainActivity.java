package com.danih.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView txtHolaMundo;
  String[] frases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHolaMundo = findViewById(R.id.txtHolaMundo);
        frases= new String[5];
        frases[0]= "Te va a tocar la lotería";
        frases[1]= "No vas a tener errores en el codigo";
        frases[2]=  "Todos los alumnos aprobarán";
        frases[3]= "Me va  a salir un proyecto muy chulo";
        frases[4]= "El fin de semana comeré un chuletón";

    }

    public void generarSaludo(View view) {
        int num = (int)(Math.random()*5);
        //mostrar la frase del array
        txtHolaMundo.setText(frases[num]);

    }
}
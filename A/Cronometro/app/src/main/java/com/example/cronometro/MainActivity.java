package com.example.cronometro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    ImageButton btn_start,btn_stop,btn_reset;
    Chronometer chronometro;
    Boolean correr=false;
    long detenerse;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_start=findViewById(R.id.play);
        btn_stop=findViewById(R.id.pause);
        btn_reset=findViewById(R.id.reset);
        chronometro=findViewById(R.id.cronometro);

        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                startChronometro();
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                stopChronometro();
            }
        });

        btn_reset.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                resetChronometro();
            }
        });
    }

    private void resetChronometro() {
        chronometro.setBase(SystemClock.elapsedRealtime());
        detenerse=0;
    }

    private void stopChronometro() {
        if (correr){
            chronometro.stop();
            detenerse = SystemClock.elapsedRealtime() - chronometro.getBase();
            correr=false;
        }
    }

    private void startChronometro() {
        if(!correr){
            chronometro.setBase(SystemClock.elapsedRealtime() - detenerse);
            chronometro.start();
            correr=true;
        }
    }

    public void Resultados(View view){
        Intent resultados = new Intent(this, resultados.class);
        startActivity(resultados);
    }

}

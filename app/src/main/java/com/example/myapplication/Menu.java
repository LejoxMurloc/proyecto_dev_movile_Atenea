package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        //declaración los btn
        Button btnHidroTrack = findViewById(R.id.btn_HidroTrack);
        Button btnEcoEnergy = findViewById(R.id.btn_EcoEnergy);
        Button btnRepaso = findViewById(R.id.btn_Repaso);
        Button btnMargenOpti = findViewById(R.id.btn_MargenOpti);
        Button btnReproductor = findViewById(R.id.btn_Reproductor);
        Button btnDiseno = findViewById(R.id.btn_Diseno);
        Button btnScroll = findViewById(R.id.btn_Scroll);
        Button btnTablas = findViewById(R.id.btn_Tablas);
        Button btnRepFinal = findViewById(R.id.btn_RepFinal);

        //Funcionalidad del btn
        //hidro
        btnHidroTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //eco
        btnEcoEnergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //rep
        btnRepaso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //margen
        btnMargenOpti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //repo
        btnReproductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //dise
        btnDiseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //scroll
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //tablas
        btnTablas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
        //repfin
        btnRepFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Menu.this, Design.class);
                startActivity(intento);
            }
        });
    }
}
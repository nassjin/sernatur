package com.csto.sernatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton foto1, foto2, satelite;
    Button VOLVER;
    String LUGAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        foto1 = (ImageButton) findViewById(R.id.imageButton);
        foto2 = (ImageButton) findViewById(R.id.imageButton2);
        satelite = (ImageButton) findViewById(R.id.btn_satelite);
        VOLVER = (Button) findViewById(R.id.btn_volver);

        Bundle B = getIntent().getExtras();
        LUGAR = B.getString("LUGARES");

        if (LUGAR.equals("ROMA")){
            foto1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),Roma.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);
                }
            });

            foto2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),Roma1.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);

                }
            });

            satelite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),RomaMap.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);
                }
            });


        }
        if (LUGAR.equals("PARIS")){
            foto1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),Paris.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);
                }
            });

            foto2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),Paris1.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);

                }
            });

            satelite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),ParisMap.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);
                }
            });

        }
        if (LUGAR.equals("LIMA")){
            foto1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),Lima.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);
                }
            });

            foto2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),Lima1.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);

                }
            });

            satelite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent I = new Intent(getApplicationContext(),LimaMap.class);
                    I.putExtra("LUGARES",LUGAR);
                    startActivity(I);
                }
            });
        }

        VOLVER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                I.putExtra("LUGARES",LUGAR);
                startActivity(I);
            }
        });

    }
}
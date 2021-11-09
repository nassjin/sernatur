package com.csto.sernatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Paris extends AppCompatActivity {
    Button VOLVER;
    String LUGAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paris);

        VOLVER = (Button)findViewById(R.id.button3);
        Bundle B = getIntent().getExtras();
        LUGAR = B.getString("LUGARES");

        VOLVER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                I.putExtra("LUGARES",LUGAR);
                startActivity(I);
            }
        });
    }
}
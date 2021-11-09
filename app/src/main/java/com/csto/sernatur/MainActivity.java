package com.csto.sernatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner SP1;
    Button CONTINUAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SP1 = (Spinner) findViewById(R.id.sp_lugar);
        CONTINUAR = (Button) findViewById(R.id.btn_continuar);

        CONTINUAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(SP1.getSelectedItem()=="..."){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar lugar",Toast.LENGTH_LONG).show();
                }
                else{
                    String Lugar = SP1.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("LUGARES",Lugar);
                    startActivity(I);
                }


            }
        });
    }
}
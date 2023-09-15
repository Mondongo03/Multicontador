package com.ruben.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int contador;
    TextView texto1;
    Button boton1;
    Button reset1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1 = findViewById(R.id.text);
        boton1 = findViewById(R.id.ResetAll);


    }
}
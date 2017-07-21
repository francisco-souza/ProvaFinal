package com.example.laboratorio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void questao1(View view){
        Intent i = new Intent(this, Questao1.class);
        startActivity(i);
    }
    public void questao2(View view){
        Intent i = new Intent(this, Questao2.class);
        startActivity(i);
    }
    public void questao3(View view){
        Intent i = new Intent(this, Questao3.class);
        startActivity(i);
    }
    public void questao4(View view){
        Intent i = new Intent(this, Questao4.class);
        startActivity(i);
    }

}

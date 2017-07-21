package com.example.laboratorio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Questao3 extends AppCompatActivity {

     EditText quantidade;
        TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao3);

        quantidade = (EditText) findViewById(R.id.quantidadelivro);
        resultado = (TextView) findViewById(R.id.resultado);
    }
    public void desconto(View view){
        int qtd = Integer.valueOf(quantidade.getText().toString());

       double valora ;double valorb;
        String res = "";
        valora = (qtd * 0.25 + 7.50);
        valorb = (qtd * 0.50 + 2.50);

        if(valora < valorb){
            res = " Plano A "+valora;
        }else{
            res = "Plano B "+valorb;
        }

        resultado.setText("Resultado : "+res);

    }
}

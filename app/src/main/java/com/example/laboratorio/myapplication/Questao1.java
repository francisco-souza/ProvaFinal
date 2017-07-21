package com.example.laboratorio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Questao1 extends AppCompatActivity {
    EditText alcool , gasolina;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        alcool = (EditText)findViewById(R.id.alcool);
        gasolina = (EditText)findViewById(R.id.gasolina);
        resultado = (TextView)findViewById(R.id.resultado);
    }
    public void verificar(View view){
        String resu = "";
        double a = Double.parseDouble(alcool.getText().toString());
        double g = Double.parseDouble(gasolina.getText().toString());

        double res;
        res=(((g - a)*100)/a);

        if(res < 30){
            resu = "Gasolina";
        }else{
            resu = "Alcool";
        }
        resultado.setText("resultado "+resu);
    }
}

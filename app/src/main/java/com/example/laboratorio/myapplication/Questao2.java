package com.example.laboratorio.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Questao2 extends AppCompatActivity {
    EditText n1 ,n2 , n3 , n4;
    TextView resultado1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao2);

        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        n3 = (EditText) findViewById(R.id.n3);
        n4 = (EditText) findViewById(R.id.n4);
        resultado1 = (TextView) findViewById(R.id.resultado1);
    }
    public void exame(View view){

        int nota1 = Integer.valueOf(n1.getText().toString());
        int nota2 = Integer.valueOf(n2.getText().toString());
        int nota3 = Integer.valueOf(n3.getText().toString());

        int media = (nota1 + nota2 + nota3) / 3;
        String res1 = "";
        int valor = 0;

        if(media >= 7){
            res1 = "Aluno Aprovado";

        }else if(media < 7) {
            valor = 1;
            res1 = "Digite a Nota Final";


        }

        if(valor == 1) {
            String nota4 = String.valueOf(n4.getText().toString());
            int tamanho = nota4.length() ;// isso preenche tamanho com o comprimento de Nome.
            if(tamanho > 0) {


                int  x = Integer.parseInt(nota4);

                int fin = (media + x) / 2;
                if (fin >= 5) {
                    res1 = "Passou";
                } else {
                    res1 = "Reprovou";
                }
            }else {
                res1 = "Digite a Nota Final";
            }

        }
        resultado1.setText("Resultado : "+res1);



    }
}

package com.example.casa.projetointegrador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by casa on 01/04/2017.
 */

public class Resultado extends Activity {

    private int[] imagens = new int[]{R.drawable.imc_masculino, R.drawable.imc_feminino};
    private String[] sexos = new String[]{"masculino", "feminino"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);

        Intent it = getIntent();

        if(it != null){
            Bundle informacoes = it.getExtras();

            if(informacoes != null){
                Float imc = informacoes.getFloat("imc");
                String sexo = informacoes.getString("sexo");

                TextView tela2 = (TextView) findViewById(R.id.calculo);
                tela2.setText(imc.toString());


                final ImageView imgTabela = (ImageView) findViewById(R.id.tabela);

                ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sexos);
            }
        }
    }

}

package com.journaldev.recyclerviewcardview.Inicio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.journaldev.recyclerviewcardview.HistoricoAdocoes.HistoricoAdocao;
import com.journaldev.recyclerviewcardview.ListaAnimais.MainActivity;
import com.journaldev.recyclerviewcardview.R;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        Button botao = (Button) findViewById(R.id.buttoinicial);
        Button botao2 = (Button) findViewById(R.id.buttoinicial2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                view.getContext().startActivity(intent);
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), HistoricoAdocao.class);
                view.getContext().startActivity(intent);
            }
        });
    }

}

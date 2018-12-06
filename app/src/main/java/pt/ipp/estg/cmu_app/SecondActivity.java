package pt.ipp.estg.cmu_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button Rotas;
    private Button Entregas;
    private Button Conta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Entregas = findViewById(R.id.entregasButton);
        Rotas = findViewById(R.id.rotaButton);
        Conta = findViewById(R.id.contaButton);


        Entregas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, EntregasActivity.class);
                startActivity(intent);
            }
        });

        Rotas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, RotasActivity.class);
                startActivity(intent);
            }
        });

        Conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ContaActivity.class);
                startActivity(intent);
            }
        });

    }
}

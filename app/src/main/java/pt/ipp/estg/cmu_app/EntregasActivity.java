package pt.ipp.estg.cmu_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EntregasActivity extends AppCompatActivity {

    private Button nEntrega;
    private Button nEncomenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entregas);

        nEntrega = findViewById(R.id.nEntregaButton);
        nEncomenda = findViewById(R.id.nEncomendaButton);

        nEntrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntregasActivity.this, NewEntregaActivity.class);
                startActivity(intent);
            }
        });

        nEncomenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntregasActivity.this, NewEncomendaActivity.class);
                startActivity(intent);
            }
        });
    }
}

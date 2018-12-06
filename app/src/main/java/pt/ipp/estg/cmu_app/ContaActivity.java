package pt.ipp.estg.cmu_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContaActivity extends AppCompatActivity {

    private Button addCliente;
    private Button addProduto;
    private Button rmvCliente;
    private Button rmvProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        addCliente = findViewById(R.id.addClienteButton);
        addProduto = findViewById(R.id.addProdutoButton);
        rmvCliente = findViewById(R.id.rmvClienteButton);
        rmvProduto = findViewById(R.id.rmvProdutoButton);


        addCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContaActivity.this, AddClienteActivity.class);
                startActivity(intent);
            }
        });

        addProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContaActivity.this, addProdutoActivity.class);
                startActivity(intent);
            }
        });

        rmvCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContaActivity.this, RmvClienteActivity.class);
                startActivity(intent);
            }
        });

        rmvProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContaActivity.this, RmvProdutoActivity.class);
                startActivity(intent);
            }
        });
    }
}

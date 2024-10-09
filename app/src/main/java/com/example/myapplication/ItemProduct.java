package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ItemProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_product);
// Receber dados do Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("PRODUCT_NAME" + "Produto não encontrado");
        String description = intent.getStringExtra("PRODUCT_DESCRIPTION" + "Sem descrição");

// Configurar os TextViews
        TextView productNameTextView = findViewById(R.id.product_name);
        TextView productDescriptionTextView = findViewById(R.id.product_price);
        productNameTextView.setText(name);
        productDescriptionTextView.setText(description);

// Configurar o botão
        Button acquireButton = findViewById(R.id.acquireButton);
        acquireButton.setOnClickListener(v -> {
            // Lógica de aquisição do produto
            // Exemplo: exibir um Toast
            Toast.makeText(this, "Adicionando " + name + " ao carrinho", Toast.LENGTH_SHORT).show();
            // Outras ações, como enviar dados para um servidor ou abrir uma nova Activity
        });
    }
}
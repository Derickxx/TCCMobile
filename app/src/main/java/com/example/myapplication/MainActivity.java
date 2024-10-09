package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Product> products = new ArrayList<>();
        products.add(new Product("Produto 1", "$10.00"));
        products.add(new Product("Produto 2", "$15.00"));
        products.add(new Product("Produto 3", "$20.00"));
        // Adicione mais produtos conforme necessário

        ProductAdapter adapter = new ProductAdapter(this, products);
        recyclerView.setAdapter(adapter);
    }
}



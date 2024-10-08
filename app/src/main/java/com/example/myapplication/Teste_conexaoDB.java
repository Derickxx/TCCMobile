package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Connection;

public class Teste_conexaoDB extends AppCompatActivity {

    TextView BancoTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_conexao_db);

       Connection conn = CriarBancoDB.conectar(Teste_conexaoDB.this);
       BancoTeste = findViewById(R.id.BancoTeste);

        try {
            if (conn != null) {
                if (!conn.isClosed())
                    BancoTeste.setText("Conexao feita");
                else
                    BancoTeste.setText("A conexao foi fechada");
            } else {
                BancoTeste.setText("conexao nula");

            }
        } catch(java.sql.SQLException ex){
                ex.printStackTrace();
                BancoTeste.setText("conecao falhou \n" + ex.getMessage());
            }

    }

    }


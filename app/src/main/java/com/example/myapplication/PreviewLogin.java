package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PreviewLogin extends AppCompatActivity {
    Button BotaoPreview;

    Button BotaoPreview1;
    Button BotaoPreview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_login);

        BotaoPreview = findViewById(R.id.BotaoPreview);

        BotaoPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewLogin.this, Login.class);
                startActivity(intent);

            }
        });


        BotaoPreview1 = findViewById(R.id.BotaoPreview1);

        BotaoPreview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewLogin.this, Cadastro.class);
                startActivity(intent);

            }
        });

        BotaoPreview2 = findViewById(R.id.BotaoPreview2);

        BotaoPreview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreviewLogin.this, Home.class);
                startActivity(intent);

            }
        });


    }
    }

package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuAct extends AppCompatActivity {

    private ImageButton snap, navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmenu);

        this.snap= (android.widget.ImageButton)this.findViewById(R.id.btnsnap);
        this.snap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MenuAct.this.openSnapMenuAct();
            }
        });

        this.navegador= (android.widget.ImageButton)this.findViewById(R.id.btnnavegador);
        this.navegador.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MenuAct.this.openNavegadorAct();
            }
        });
    }

    public void openSnapMenuAct() {
        Intent intent = new Intent(this, SnapMenuAct.class);
        this.startActivity(intent);
    }

    public void openNavegadorAct() {
        Intent intent = new Intent(this, NavegadorAct.class);
        this.startActivity(intent);
    }
}
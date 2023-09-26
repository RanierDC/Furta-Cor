package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SnapMenuAct extends AppCompatActivity {

    private ImageButton voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actsnapmenu);

        this.voltar = (android.widget.ImageButton)this.findViewById(R.id.btnmenu3);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }
}
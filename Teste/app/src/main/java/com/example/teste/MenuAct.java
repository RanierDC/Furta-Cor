package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MenuAct extends AppCompatActivity {

    private ImageButton snap, navegador, email, calculator, notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmenu);

        this.snap = (android.widget.ImageButton)this.findViewById(R.id.btnsnap);
        this.snap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MenuAct.this.openSnapMenuAct();
            }
        });

        this.navegador = (android.widget.ImageButton)this.findViewById(R.id.btnnavegador);
        this.navegador.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MenuAct.this.openNavegadorAct();
            }
        });

        this.email = (android.widget.ImageButton)this.findViewById(R.id.btnemail);
        this.email.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { MenuAct.this.openEmailAct();
            }
        });

        this.calculator = (android.widget.ImageButton)this.findViewById(R.id.btncalculadora);
        this.calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { MenuAct.this.openCalculatorAct();
            }
        });

        this.notes = (android.widget.ImageButton)this.findViewById(R.id.btnnotes);
        this.notes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { MenuAct.this.openNotesAct();
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

    public void openEmailAct() {
        Intent intent = new Intent(this, EmailAct.class);
        this.startActivity(intent);
    }

    public void openCalculatorAct() {
        Intent intent = new Intent(this, CalculatorAct.class);
        this.startActivity(intent);
    }

    public void openNotesAct() {
        Intent intent = new Intent(this, NoteMenuAct.class);
        this.startActivity(intent);
    }


    @Override
    protected void onResume() {
        super.onResume();

        hideNavigationBar();
    }

    private void hideNavigationBar(){
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }
}
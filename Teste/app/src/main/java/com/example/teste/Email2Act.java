package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Email2Act extends AppCompatActivity {

    private ImageButton voltar, menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actemail2);

        this.voltar = (android.widget.ImageButton) this.findViewById(R.id.btnmenu19);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Email2Act.this.openMainActivity();
            }
        });

        this.menu = (android.widget.ImageButton) this.findViewById(R.id.btnvoltaremail);
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Email2Act.this.openEmailMenu();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    public void openEmailMenu() {
        Intent intent = new Intent(this, EmailAct.class);
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
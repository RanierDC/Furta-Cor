package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class EmailAct extends AppCompatActivity {

    private ImageButton voltar, email1, email2, email3, email4, email5, email6, email7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actemail);

        this.voltar = (android.widget.ImageButton) this.findViewById(R.id.btnmenu4);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openMainActivity();
            }
        });

        this.email1 = (android.widget.ImageButton) this.findViewById(R.id.btnmsg1);
        this.email1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg1();
            }
        });
    }


    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    public void openEmailMsg1() {
        Intent intent = new Intent(this, Email1Act.class);
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
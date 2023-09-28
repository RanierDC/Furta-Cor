package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class SnapMenuAct extends AppCompatActivity {

    private ImageButton voltar, msg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.actsnapmenu);

        this.voltar = (android.widget.ImageButton)this.findViewById(R.id.btnmenu3);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMainActivity();
            }
        });

        this.msg1 = (android.widget.ImageButton)this.findViewById(R.id.btnmsg1);
        this.msg1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg1Activity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    public void openMsg1Activity() {
        Intent intent = new Intent(this, Msg1Act.class);
        this.startActivity(intent);
    }
}
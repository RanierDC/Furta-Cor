package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NoteMenuAct extends AppCompatActivity {

    private ImageButton voltar, note1, note2, note3, note4, note5, note6, note7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actnotemenu);

        this.voltar = (android.widget.ImageButton)this.findViewById(R.id.btnmenu21);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openMainActivity();
            }
        });

        this.note1 = (android.widget.ImageButton)this.findViewById(R.id.btnnote1);
        this.note1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote1Act();
            }
        });
    }

    public void openNote1Act() {
        Intent intent = new Intent(this, Note1Act.class);
        this.startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
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
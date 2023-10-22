package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class NoteMenuAct extends AppCompatActivity {

    private ArrayList<String> textList;
    private ImageButton menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actnotemenu);

        ImageButton button1 = findViewById(R.id.btnnote1);
        ImageButton button2 = findViewById(R.id.btnnote2);
        ImageButton button3 = findViewById(R.id.btnnote3);
        ImageButton button4 = findViewById(R.id.btnnote4);
        ImageButton button5 = findViewById(R.id.btnnote5);
        ImageButton button6 = findViewById(R.id.btnnote6);
        ImageButton button7 = findViewById(R.id.btnnote7);

        this.menu = (android.widget.ImageButton) this.findViewById(R.id.btnnotemenu);
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openMainActivity();
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt1),
                        getString(R.string.noteact1)
                };
                openActivity2(texts);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt2),
                        getString(R.string.noteact2)
                };
                openActivity2(texts);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt3),
                        getString(R.string.noteact3)
                };
                openActivity2(texts);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt4),
                        getString(R.string.noteact4)
                };
                openActivity2(texts);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt5),
                        getString(R.string.noteact5)
                };
                openActivity2(texts);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt6),
                        getString(R.string.noteact6)
                };
                openActivity2(texts);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.notemt7),
                        getString(R.string.noteact7)
                };
                openActivity2(texts);
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    private void openActivity2(String[] texts) {
        Intent intent = new Intent(this, Note1Act.class);
        intent.putExtra("texts", texts);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        hideNavigationBar();
    }

    private void hideNavigationBar() {
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
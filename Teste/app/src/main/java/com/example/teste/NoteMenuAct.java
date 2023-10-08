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

        this.note2 = (android.widget.ImageButton)this.findViewById(R.id.btnnote2);
        this.note2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote2Act();
            }
        });

        this.note3 = (android.widget.ImageButton)this.findViewById(R.id.btnnote3);
        this.note3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote3Act();
            }
        });

        this.note4 = (android.widget.ImageButton)this.findViewById(R.id.btnnote4);
        this.note4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote4Act();
            }
        });

        this.note5 = (android.widget.ImageButton)this.findViewById(R.id.btnnote5);
        this.note5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote5Act();
            }
        });

        this.note6 = (android.widget.ImageButton)this.findViewById(R.id.btnnote6);
        this.note6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote6Act();
            }
        });

        this.note7 = (android.widget.ImageButton)this.findViewById(R.id.btnnote7);
        this.note7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { NoteMenuAct.this.openNote7Act();
            }
        });
    }

    public void openNote1Act() {
        Intent intent = new Intent(this, Note1Act.class);
        this.startActivity(intent);
    }

    public void openNote2Act() {
        Intent intent = new Intent(this, Note2Act.class);
        this.startActivity(intent);
    }

    public void openNote3Act() {
        Intent intent = new Intent(this, Note3Act.class);
        this.startActivity(intent);
    }

    public void openNote4Act() {
        Intent intent = new Intent(this, Note4Act.class);
        this.startActivity(intent);
    }

    public void openNote5Act() {
        Intent intent = new Intent(this, Note5Act.class);
        this.startActivity(intent);
    }

    public void openNote6Act() {
        Intent intent = new Intent(this, Note6Act.class);
        this.startActivity(intent);
    }

    public void openNote7Act() {
        Intent intent = new Intent(this, Note7Act.class);
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
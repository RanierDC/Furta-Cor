package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EmailAct extends AppCompatActivity {

    private ImageButton voltar, email1, email2, email3, email4, email5, email6, email7, email8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actemail);

        this.voltar = (android.widget.ImageButton) this.findViewById(R.id.btnmenu4);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openMainActivity();
            }
        });

        this.email1 = (android.widget.ImageButton) this.findViewById(R.id.btnsnapmsg1);
        this.email1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg1();
            }
        });

        this.email2 = (android.widget.ImageButton) this.findViewById(R.id.btnemail2);
        this.email2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg2();
            }
        });

        this.email3 = (android.widget.ImageButton) this.findViewById(R.id.btnemail3);
        this.email3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg3();
            }
        });

        this.email4 = (android.widget.ImageButton) this.findViewById(R.id.btnemail4);
        this.email4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg4();
            }
        });

        this.email5 = (android.widget.ImageButton) this.findViewById(R.id.btnemail5);
        this.email5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg5();
            }
        });

        this.email6 = (android.widget.ImageButton) this.findViewById(R.id.btnemail6);
        this.email6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg6();
            }
        });

        this.email7 = (android.widget.ImageButton) this.findViewById(R.id.btnemail7);
        this.email7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg6();
            }
        });

        this.email8 = (android.widget.ImageButton) this.findViewById(R.id.btnemail8);
        this.email8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailAct.this.openEmailMsg8();
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

    public void openEmailMsg2() {
        Intent intent = new Intent(this, Email2Act.class);
        this.startActivity(intent);
    }

    public void openEmailMsg3() {
        Intent intent = new Intent(this, Email3Act.class);
        this.startActivity(intent);
    }

    public void openEmailMsg4() {
        Intent intent = new Intent(this, Email4Act.class);
        this.startActivity(intent);
    }

    public void openEmailMsg5() {
        Intent intent = new Intent(this, Email5Act.class);
        this.startActivity(intent);
    }

    public void openEmailMsg6() {
        Intent intent = new Intent(this, Email6Act.class);
        this.startActivity(intent);
    }

    public void openEmailMsg7() {
        Intent intent = new Intent(this, Email7Act.class);
        this.startActivity(intent);
    }

    public void openEmailMsg8() {
        Intent intent = new Intent(this, Email8Act.class);
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
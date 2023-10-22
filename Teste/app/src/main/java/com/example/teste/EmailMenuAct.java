package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

public class EmailMenuAct extends AppCompatActivity {

    private ArrayList<String> textList;
    private ImageButton menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actemailmenu);

        ImageButton button1 = findViewById(R.id.btnemail1);
        ImageButton button2 = findViewById(R.id.btnemail2);
        ImageButton button3 = findViewById(R.id.btnemail3);
        ImageButton button4 = findViewById(R.id.btnemail4);
        ImageButton button5 = findViewById(R.id.btnemail5);
        ImageButton button6 = findViewById(R.id.btnemail6);
        ImageButton button7 = findViewById(R.id.btnemail7);
        ImageButton button8 = findViewById(R.id.btnemail8);

        this.menu = (android.widget.ImageButton) this.findViewById(R.id.btnmenuemail);
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { EmailMenuAct.this.openMainActivity();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailt1),
                        getString(R.string.emailmontanha),
                        getString(R.string.emaildata1),
                        getString(R.string.email1text)
                };
                int imageResourceId = R.drawable.imgiconmontanha;
                openActivity2(texts, imageResourceId);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailt2),
                        getString(R.string.emailforport),
                        getString(R.string.emaildata2),
                        getString(R.string.email2text)
                };
                int imageResourceId = R.drawable.imgiconforport;
                openActivity2(texts, imageResourceId);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailtitle3),
                        getString(R.string.emailforport),
                        getString(R.string.emaildata3),
                        getString(R.string.email3text)
                };
                int imageResourceId = R.drawable.imgiconforport;
                openActivity2(texts, imageResourceId);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailtitle4),
                        getString(R.string.emailciborgue),
                        getString(R.string.emaildata4),
                        getString(R.string.email4text)
                };
                int imageResourceId = R.drawable.imgiconciborgue;
                openActivity2(texts, imageResourceId);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailt5),
                        getString(R.string.emailsouthern),
                        getString(R.string.emaildata5),
                        getString(R.string.email5text)
                };
                int imageResourceId = R.drawable.imgiconsouthern;
                openActivity2(texts, imageResourceId);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailt6),
                        getString(R.string.emailgambit),
                        getString(R.string.emaildata6),
                        getString(R.string.email6text)
                };
                int imageResourceId = R.drawable.imgicongambit;
                openActivity2(texts, imageResourceId);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailt7),
                        getString(R.string.emailmontanha),
                        getString(R.string.emaildata7),
                        getString(R.string.email7text)
                };
                int imageResourceId = R.drawable.imgiconmontanha;
                openActivity2(texts, imageResourceId);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] texts = {
                        getString(R.string.emailt8),
                        getString(R.string.emailgambit),
                        getString(R.string.emaildata8),
                        getString(R.string.email8text)
                };
                int imageResourceId = R.drawable.imgicongambit;
                openActivity2(texts, imageResourceId);
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    private void openActivity2(String[] texts, int imageResourceId) {
        Intent intent = new Intent(this, Email1Act.class);
        intent.putExtra("texts", texts);
        intent.putExtra("imageResourceId", imageResourceId);
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
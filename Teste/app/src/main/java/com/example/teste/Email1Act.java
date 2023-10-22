package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Email1Act extends AppCompatActivity {

    private ImageButton voltar, menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actemail1);

        TextView textView1 = findViewById(R.id.textemailtitle1);
        TextView textView2 = findViewById(R.id.textemailtitle2);
        TextView textView3 = findViewById(R.id.textemailtitle3);
        TextView textView4 = findViewById(R.id.textemailmsg);
        ImageView imageView = findViewById(R.id.imgiconemail);

        String[] texts = getIntent().getStringArrayExtra("texts");

        int imageResourceId = getIntent().getIntExtra("imageResourceId", 0);

        if (texts != null && texts.length >= 4) {
            textView1.setText(texts[0]);
            textView2.setText(texts[1]);
            textView3.setText(texts[2]);
            textView4.setText(texts[3]);
        }

        if (imageResourceId != 0) {
            imageView.setImageResource(imageResourceId);
        }

        this.voltar = (android.widget.ImageButton) this.findViewById(R.id.btnmenu12);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Email1Act.this.openMainActivity();
            }
        });

        this.menu = (android.widget.ImageButton) this.findViewById(R.id.btnvoltaremail);
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Email1Act.this.openEmailMenu();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    public void openEmailMenu() {
        Intent intent = new Intent(this, EmailMenuAct.class);
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
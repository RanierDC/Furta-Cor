package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class Galeria9Act extends AppCompatActivity {

    float x1, x2, y1, y2;
    private ImageButton menu, voltar;

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actgaleria9);
        this.menu= (android.widget.ImageButton) this.findViewById(R.id.btnmenugf9);
        this.menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Galeria9Act.this.openMainActivity();
            }
        });

        this.voltar= (android.widget.ImageButton) this.findViewById(R.id.btnvoltarglr9);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { Galeria9Act.this.openGaleriaMenuActivity();
            }
        });
    }

    public void openGaleriaMenuActivity() {
        Intent intent = new Intent(this, GaleriaMenuAct.class);
        this.startActivity(intent);
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MenuAct.class);
        this.startActivity(intent);
    }

    public boolean onTouchEvent(MotionEvent touchEvent) {
        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if (x1 > x2) {
                    Intent i = new Intent(Galeria9Act.this, Galeria10Act.class);
                    startActivity(i);
                } else if (x1 < x2) {
                    Intent i = new Intent(Galeria9Act.this, Galeria8Act.class);
                    startActivity(i);
                }
                break;
        }
        return false;
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
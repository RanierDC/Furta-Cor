package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SnapMenuAct extends AppCompatActivity {

    private ImageButton voltar, msg1, msg2, msg3, msg4, msg5, msg6, msg7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actsnapmenu);

        this.voltar = (android.widget.ImageButton)this.findViewById(R.id.btnmenu3);
        this.voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMainActivity();
            }
        });

        this.msg1 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg1);
        this.msg1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg1Activity();
            }
        });

        this.msg2 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg2);
        this.msg2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg2Activity();
            }
        });

        this.msg3 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg3);
        this.msg3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg3Activity();
            }
        });

        this.msg4 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg4);
        this.msg4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg4Activity();
            }
        });

        this.msg5 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg5);
        this.msg5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg5Activity();
            }
        });

        this.msg6 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg6);
        this.msg6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg6Activity();
            }
        });

        this.msg7 = (android.widget.ImageButton)this.findViewById(R.id.btnsnapmsg7);
        this.msg7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SnapMenuAct.this.openMsg7Activity();
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

    public void openMsg2Activity() {
        Intent intent = new Intent(this, Msg2Act.class);
        this.startActivity(intent);
    }

    public void openMsg3Activity() {
        Intent intent = new Intent(this, Msg3Act.class);
        this.startActivity(intent);
    }

    public void openMsg4Activity() {
        Intent intent = new Intent(this, Msg4Act.class);
        this.startActivity(intent);
    }

    public void openMsg5Activity() {
        Intent intent = new Intent(this, Msg5Act.class);
        this.startActivity(intent);
    }

    public void openMsg6Activity() {
        Intent intent = new Intent(this, Msg6Act.class);
        this.startActivity(intent);
    }

    public void openMsg7Activity() {
        Intent intent = new Intent(this, Msg7Act.class);
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


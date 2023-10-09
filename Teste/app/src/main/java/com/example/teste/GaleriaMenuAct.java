package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class GaleriaMenuAct extends AppCompatActivity {

    private ImageButton voltar, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitygaleriamenu);

        this.img1= (android.widget.ImageButton) this.findViewById(R.id.btnimg1);
        this.img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg1();
            }
        });

        this.img2= (android.widget.ImageButton) this.findViewById(R.id.btnimg2);
        this.img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg2();
            }
        });

        this.img3= (android.widget.ImageButton) this.findViewById(R.id.btnimg3);
        this.img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg3();
            }
        });

        this.img4= (android.widget.ImageButton) this.findViewById(R.id.btnimg4);
        this.img4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg4();
            }
        });

        this.img5= (android.widget.ImageButton) this.findViewById(R.id.btnimg5);
        this.img5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg5();
            }
        });

        this.img6= (android.widget.ImageButton) this.findViewById(R.id.btnimg6);
        this.img6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg6();
            }
        });

        this.img7= (android.widget.ImageButton) this.findViewById(R.id.btnimg7);
        this.img7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg7();
            }
        });

        this.img8= (android.widget.ImageButton) this.findViewById(R.id.btnimg8);
        this.img8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg8();
            }
        });

        this.img9= (android.widget.ImageButton) this.findViewById(R.id.btnimg9);
        this.img9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg9();
            }
        });

        this.img10= (android.widget.ImageButton) this.findViewById(R.id.btnimg10);
        this.img10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg10();
            }
        });

        this.img11= (android.widget.ImageButton) this.findViewById(R.id.btnimg11);
        this.img11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { GaleriaMenuAct.this.openImg11();
            }
        });
    }

    public void openImg1() {
        Intent intent = new Intent(this, Galeria1Act.class);
        this.startActivity(intent);
    }

    public void openImg2() {
        Intent intent = new Intent(this, Galeria2Act.class);
        this.startActivity(intent);
    }

    public void openImg3() {
        Intent intent = new Intent(this, Galeria3Act.class);
        this.startActivity(intent);
    }

    public void openImg4() {
        Intent intent = new Intent(this, Galeria4Act.class);
        this.startActivity(intent);
    }

    public void openImg5() {
        Intent intent = new Intent(this, Galeria5Act.class);
        this.startActivity(intent);
    }

    public void openImg6() {
        Intent intent = new Intent(this, Galeria6Act.class);
        this.startActivity(intent);
    }

    public void openImg7() {
        Intent intent = new Intent(this, Galeria7Act.class);
        this.startActivity(intent);
    }

    public void openImg8() {
        Intent intent = new Intent(this, Galeria8Act.class);
        this.startActivity(intent);
    }

    public void openImg9() {
        Intent intent = new Intent(this, Galeria9Act.class);
        this.startActivity(intent);
    }

    public void openImg10() {
        Intent intent = new Intent(this, Galeria10Act.class);
        this.startActivity(intent);
    }

    public void openImg11() {
        Intent intent = new Intent(this, Galeria11Act.class);
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
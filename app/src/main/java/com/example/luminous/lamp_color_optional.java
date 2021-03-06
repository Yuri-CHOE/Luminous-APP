package com.example.luminous;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class lamp_color_optional extends AppCompatActivity {

    //램프컬러 변경 확인
    private ImageView select_color;

    private Button btn_romantic;
    private Button btn_Good;
    private Button btn_Lively;
    private Button btn_Gloomy;
    private Button btn_Refreshing;
    private Button btn_Lovely;
    private Button btn_Tiring;
    private Button btn_Calm;
    private Button btn_book;
    private Button btn_Passionate;
    private Button btn_Cool;

    //private Button btn_color_section_close;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamp_color_optional);

        // 색상 선택

        select_color = findViewById(R.id.lamp_click_color);

        btn_romantic = findViewById(R.id.btn_romantic);
        btn_romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#F8D6D4"));
            }
        });

        btn_Good = findViewById(R.id.btn_Good);
        btn_Good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#FC887B"));
            }
        });

        btn_Lively =findViewById(R.id.btn_Lively);
        btn_Lively.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#9DE2ED"));

            }
        });

        btn_Gloomy = findViewById(R.id.btn_Gloomy);
        btn_Gloomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#58094F"));
            }
        });

        btn_Refreshing = findViewById(R.id.btn_Refreshing);
        btn_Refreshing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#FFF488"));
            }
        });

        btn_Lovely = findViewById(R.id.btn_Lovely);
        btn_Lovely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#FE87AC"));
            }
        });

        btn_Tiring = findViewById(R.id.btn_Tiring);
        btn_Tiring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#5E6072"));
            }
        });

        btn_Calm =findViewById(R.id.btn_Calm);
        btn_Calm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#6A847A"));
            }
        });

        btn_book = findViewById(R.id.btn_book);
        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#FFEF92"));
            }
        });

        btn_Passionate = findViewById(R.id.btn_Passionate);
        btn_Passionate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#D31D0D"));
            }
        });

        btn_Cool = findViewById(R.id.btn_Cool);
        btn_Cool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select_color.setColorFilter(Color.parseColor("#00487A"));
            }
        });
    }
}
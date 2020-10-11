package com.example.mymateril;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    private FloatingActionButton button_save;
    private EditText ed_title, ed_subTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed_title = findViewById(R.id.edit_title);
        ed_subTitle = findViewById(R.id.editText_subTitle);
        button_save = findViewById(R.id.floatingActionButton);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String t = ed_title.getText().toString();
                final String s = ed_subTitle.getText().toString();
                if (!TextUtils.isEmpty(t) && !TextUtils.isEmpty(s)) {
                    Intent intent  = new Intent(MainActivity2.this,MainActivity.class);
                    intent.putExtra("hosni",t);
                    intent.putExtra("1234",s);
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });
        final RelativeLayout mRelativeLayout = findViewById(R.id.relative_list_item);
        final RadioButton radioButton_green = findViewById(R.id.radioButton_green);
        radioButton_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(Color.GREEN);
            }
        });
        final RadioButton radioButton_cyan = findViewById(R.id.radioButton_cyan);
        radioButton_cyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(Color.CYAN);
            }
        });
        final RadioButton radioButton_deep_orange = findViewById(R.id.radioButton_deep_orange);
        radioButton_deep_orange.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_deepOrange);
            }
        });
        final RadioButton radioButton_pink = findViewById(R.id.radioButton_pink);
        radioButton_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        final RadioButton radioButton_light_blue = findViewById(R.id.radioButton_light_blue);
        radioButton_light_blue.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_lightBlue);
            }
        });
        final RadioButton radioButton_teal = findViewById(R.id.radioButton_teal);
        radioButton_teal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_teal);
            }
        });
        final RadioButton radioButton_lime = findViewById(R.id.radioButton_lime);
        radioButton_lime.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_lime);
            }
        });
        final RadioButton radioButton_red = findViewById(R.id.radioButton_red);
        radioButton_red.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_red);
            }
        });
        final RadioButton radioButton_purple = findViewById(R.id.radioButton_purple);
        radioButton_purple.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_purple);
            }
        });
        final RadioButton radioButton_yellow = findViewById(R.id.radioButton_yellow);
        radioButton_yellow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                mRelativeLayout.setBackgroundColor(R.color.color_yellow);
            }
        });
    }
}
package com.example.assimilate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class englishlessonmenu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishlessonmenu);

        ImageButton lesson = findViewById(R.id.lesson1btn);
    }
    @Override
    public void onClick(View view){
        Intent lesson = new Intent(englishlessonmenu.this, lessonscreen.class);
        startActivity(lesson);
    }
}
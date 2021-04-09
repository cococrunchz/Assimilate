package com.example.assimilate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lessonscreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessonscreen);

        ImageButton go = findViewById(R.id.go);
    }
    @Override
    public void onClick(View view){
        Intent go = new Intent(lessonscreen.this, battlescreen.class);
        startActivity(go);
    }
}
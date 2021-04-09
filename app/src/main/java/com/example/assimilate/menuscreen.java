package com.example.assimilate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuscreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuscreen);

        ImageButton english = findViewById(R.id.englishbtn);
        english.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View view){
        Intent english = new Intent(menuscreen.this, englishlorescreen.class);
        startActivity(english);
    }
}
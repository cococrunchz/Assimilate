package com.example.assimilate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class englishlorescreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishlorescreen);

        ImageButton strt = findViewById(R.id.startbtn);
        strt.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View view){
        Intent strt = new Intent(englishlorescreen.this, englishlessonmenu.class);
        startActivity(strt);
    }
}
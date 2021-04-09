package com.example.assimilate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class opscreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opscreen);

        ImageButton start = findViewById(R.id.startBtn);
        start.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View view){
        Intent start = new Intent(opscreen.this, lorescreen.class);
        startActivity(start);
    }
}
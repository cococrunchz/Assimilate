package com.example.assimilate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lorescreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lorescreen);

        ImageButton cont = findViewById(R.id.contBtn);
        cont.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View view){
        Intent cont = new Intent(lorescreen.this, menuscreen.class);
        startActivity(cont);
    }
}
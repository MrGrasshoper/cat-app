package com.example.catapp;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView catImage = findViewById(R.id.catImage);
        Glide.with(this)
            .load("https://cataas.com/cat")
            .into(catImage);
    }
}

package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView image;
    private RadioButton rdokakashi, rdonaruto, rdosasuke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdokakashi = findViewById(R.id.rdokakashi);
        rdonaruto = findViewById(R.id.rdonaruto);
        rdosasuke = findViewById(R.id.rdosasuke);
        image = findViewById(R.id.image);

        rdokakashi.setOnClickListener(this);
        rdonaruto.setOnClickListener(this);
        rdosasuke.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdokakashi:
                Toast toast = Toast.makeText(this, "Kakashi", Toast.LENGTH_LONG);
                image.setImageResource(R.drawable.kakashi);
                toast.show();
                break;
            case R.id.rdonaruto:
                Toast toast1 = Toast.makeText(this, "Naruto", Toast.LENGTH_LONG);
                image.setImageResource(R.drawable.naruto);
                toast1.show();
                break;
            case R.id.rdosasuke:
                Toast toast2 = Toast.makeText(this, "Sasuke", Toast.LENGTH_LONG);
                image.setImageResource(R.drawable.sasuke);
                toast2.show();
                break;
        }
    }
}

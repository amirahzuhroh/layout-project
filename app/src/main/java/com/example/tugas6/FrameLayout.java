package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity {

    ImageView image1, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);

        myListener();

    }

    public void myListener() {

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image1.setVisibility(View.GONE);
                image2.setVisibility(View.VISIBLE);

            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.GONE);

            }
        });
    }
}
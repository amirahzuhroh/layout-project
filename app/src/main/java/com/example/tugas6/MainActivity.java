package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLinearLayout();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRelativeLayout();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTableLayout();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFrameLayout();
            }
        });
    }
    private void openLinearLayout() {
        Intent intent = new Intent(this, LinearLayout.class);
        startActivity(intent);
    }
    private void openRelativeLayout() {
        Intent intent = new Intent(this, RelativeLayout.class);
        startActivity(intent);
    }
    private void openTableLayout() {
        Intent intent = new Intent(this, TableLayout.class);
        startActivity(intent);
    }
    private void openFrameLayout() {
        Intent intent = new Intent(this, FrameLayout.class);
        startActivity(intent);
    }
}
package com.example.hogwarts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button linearLayout,relativeLayout,constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.admissionLinear);
        constraintLayout = findViewById(R.id.admissionConstraint);
        relativeLayout = findViewById(R.id.admissionRelative);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearIntent = new Intent(MainActivity.this,LinearLayout.class);
                startActivity(linearIntent);
            }
        });

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent constraintIntent = new Intent(MainActivity.this, ConstraintLayout.class);
                startActivity(constraintIntent);
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativeIntent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(relativeIntent);
            }
        });
    }
}
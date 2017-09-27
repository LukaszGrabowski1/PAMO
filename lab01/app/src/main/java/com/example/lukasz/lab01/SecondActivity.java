package com.example.lukasz.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String name = getIntent().getStringExtra("name");

        final TextView secondActivityTextView = (TextView) findViewById(R.id.second_activity_text_view);

        secondActivityTextView.setText("Hello " + name);
    }
}

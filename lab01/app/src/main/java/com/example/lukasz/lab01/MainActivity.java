package com.example.lukasz.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textView);
        final Button buttonChangeText = (Button) findViewById(R.id.changeTextButton);
        final EditText editText   = (EditText) findViewById(R.id.editTextField);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView.setText("Name: " + text);
            }
        });
    }
}

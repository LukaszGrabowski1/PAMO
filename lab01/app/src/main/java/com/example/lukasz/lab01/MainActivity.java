package com.example.lukasz.lab01;

import android.content.Intent;
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
        final Button secondActivityButton = (Button) findViewById(R.id.second_activity_button);
        final EditText editText   = (EditText) findViewById(R.id.editTextField);
        final Button listViewButton = (Button) findViewById(R.id.list_view_activity_button);

        final Intent secondActivityIntent = new Intent(this, SecondActivity.class);
        final Intent listViewActivityIntent = new Intent(this, ListViewActivity.class);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                textView.setText("Name: " + text);
            }
        });

        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondActivityIntent.putExtra("name", editText.getText().toString());
                startActivity(secondActivityIntent);
            }
        });

        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(listViewActivityIntent);
            }
        });
    }
}

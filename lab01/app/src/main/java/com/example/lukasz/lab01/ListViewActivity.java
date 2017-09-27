package com.example.lukasz.lab01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final ListView listView = (ListView) findViewById(R.id.list_view);

        final String[] pages = new String[3];
        pages[0] = "http://www.gdansk.pjwstk.edu.pl";
        pages[1] = "http://www.pjwstk.edu.pl";
        pages[2] = "http://www.google.pl";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pages);

        listView.setAdapter(adapter);

        final Intent webViewIntent = new Intent(this, WebViewActivity.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                webViewIntent.putExtra("url", pages[i]);
                startActivity(webViewIntent);
            }
        });
    }
}

package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String countries[];
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        countries = getResources().getStringArray(R.array.countries);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,countries);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country_name = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, "This country selected " + country_name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
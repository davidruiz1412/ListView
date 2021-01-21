package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Keyboard Samples");
        arrayList.add("Alert Samples");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    openKeyboard();
                }else if(position==1){
                    openAlert();
                }
            }
        });

    }

    public void openKeyboard(){
        Intent intentKeyboard = new Intent(this,KeyboardSample.class);
        startActivity(intentKeyboard);
    }

    public void openAlert(){
        Intent intentAlert = new Intent(this,AlertSample.class);
        startActivity(intentAlert);
    }
}
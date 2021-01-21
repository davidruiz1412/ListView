package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyboardShortcutInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class KeyboardSample extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard_sample2);

        EditText text = findViewById(R.id.editText);
        EditText email = findViewById(R.id.editEmail);
        EditText phone = findViewById(R.id.editPhone);

        Button showText = findViewById(R.id.buttonSHOWTEXT);
        Button showEmail = findViewById(R.id.buttonSHOWEMAIL);
        Button showPhone = findViewById(R.id.buttonSHOWPHONE);

        Spinner spinner = findViewById(R.id.spinnerPhone);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.phoneTypes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        showText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KeyboardSample.this, text.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        showEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KeyboardSample.this, email.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        showPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KeyboardSample.this, phone.getText(), Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
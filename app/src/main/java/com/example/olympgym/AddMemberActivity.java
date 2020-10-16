package com.example.olympgym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class AddMemberActivity extends AppCompatActivity {
    private EditText nameTextView;
    private EditText lastNameTextView;
    private EditText groupTextView;
    private Spinner genderSpinner;
    private int gender = 0;
   private  ArrayAdapter spinnerAdapter;
    private ArrayList spinnerArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        nameTextView = findViewById(R.id.firstNameInput);
        lastNameTextView = findViewById(R.id.lastNameInput);
        groupTextView = findViewById(R.id.groupInput);
        genderSpinner = findViewById(R.id.genderSpinner);


        spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.genders, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        genderSpinner.setAdapter(spinnerAdapter);



    }
}
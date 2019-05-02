package com.example.labapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Assign Add button to buttonAdd so we can modify it using Java
        Button buttonAdd = findViewById(R.id.button_add);
        final EditText textNote=findViewById(R.id.editText);
        //set Click listener to buttonAdd so it will call on click method when some one click the button
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the text
                textNote.setText("");
            }
        });
    }
    @Override
    public void onClick(View v) {
        
    }
}

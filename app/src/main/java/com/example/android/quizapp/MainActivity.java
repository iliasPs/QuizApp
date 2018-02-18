package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText input1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button start = findViewById(R.id.start);
        start.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){

        input1 = findViewById(R.id.input1);
        final String playerName = input1.getText().toString();
        Intent sendPlayerName = new Intent(this, QuizAct.class);
        sendPlayerName.putExtra("user input1", playerName);
        startActivity(sendPlayerName);


    }

}

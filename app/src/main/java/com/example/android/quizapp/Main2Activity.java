package com.example.android.quizapp;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    RadioGroup q1Group;
    RadioGroup q2Group;
    RadioGroup q3Group;
    RadioGroup q4Group;
    RadioGroup q5Group;
    RadioGroup q6Group;
    RadioButton q1R1;
    RadioButton q1R2;
    RadioButton q1R3;
    RadioButton q1R4;
    RadioButton q2R1;
    RadioButton q2R2;
    RadioButton q2R3;
    RadioButton q2R4;
    RadioButton q3R1;
    RadioButton q3R2;
    RadioButton q3R3;
    RadioButton q3R4;
    RadioButton q4R1;
    RadioButton q4R2;
    RadioButton q4R3;
    RadioButton q4R4;
    RadioButton q5R1;
    RadioButton q5R2;
    RadioButton q5R3;
    RadioButton q5R4;
    RadioButton q6R1;
    RadioButton q6R2;
    RadioButton q6R3;
    RadioButton q6R4;
    CheckBox q7R1;
    CheckBox q7R2;
    CheckBox q7R3;
    CheckBox q7R4;
    EditText q8R1;
    ImageView q1Img;
    ImageView q2Img;
    ImageView q3Img;
    ImageView q4Img;
    ImageView q5Img;
    ImageView q6Img;
    ImageView q7Img;
    ImageView q8Img;
    Button q8But;
    int listenCheck = 0;
    ColorStateList correctState;
    ColorStateList wrongState;
    int score = 0;

// im trying to figure out how to stop the toasts pop when i rotate the screen
//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//        savedInstanceState.putInt("toast1", toast1);
//    }
//
//    @Override
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        toast1 = savedInstanceState.getInt("toast1", toast1);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button button = findViewById(R.id.sub);
        q1Group = findViewById(R.id.q1Group);
        q2Group = findViewById(R.id.q2Group);
        q3Group = findViewById(R.id.q3Group);
        q4Group = findViewById(R.id.q4Group);
        q5Group = findViewById(R.id.q5Group);
        q6Group = findViewById(R.id.q6Group);
        q1R1 = findViewById(R.id.q1RadioAnswer1);
        q1R2 = findViewById(R.id.q1RadioAnswer2);
        q1R3 = findViewById(R.id.q1RadioAnswer3);
        q1R4 = findViewById(R.id.q1RadioAnswer4);
        q2R1 = findViewById(R.id.q2RadioAnswer1);
        q2R2 = findViewById(R.id.q2RadioAnswer2);
        q2R3 = findViewById(R.id.q2RadioAnswer3);
        q2R4 = findViewById(R.id.q2RadioAnswer4);
        q3R1 = findViewById(R.id.q3RadioAnswer1);
        q3R2 = findViewById(R.id.q3RadioAnswer2);
        q3R3 = findViewById(R.id.q3RadioAnswer3);
        q3R4 = findViewById(R.id.q3RadioAnswer4);
        q4R1 = findViewById(R.id.q4RadioAnswer1);
        q4R2 = findViewById(R.id.q4RadioAnswer2);
        q4R3 = findViewById(R.id.q4RadioAnswer3);
        q4R4 = findViewById(R.id.q4RadioAnswer4);
        q5R1 = findViewById(R.id.q5RadioAnswer1);
        q5R2 = findViewById(R.id.q5RadioAnswer2);
        q5R3 = findViewById(R.id.q5RadioAnswer3);
        q5R4 = findViewById(R.id.q5RadioAnswer4);
        q6R1 = findViewById(R.id.q6RadioAnswer1);
        q6R2 = findViewById(R.id.q6RadioAnswer2);
        q6R3 = findViewById(R.id.q6RadioAnswer3);
        q6R4 = findViewById(R.id.q6RadioAnswer4);
        q7R1 = findViewById(R.id.q7checkBox1);
        q7R2 = findViewById(R.id.q7checkBox2);
        q7R3 = findViewById(R.id.q7checkBox3);
        q7R4 = findViewById(R.id.q7checkBox4);
        q8R1 = findViewById(R.id.q8edit);
        q1Img = findViewById(R.id.imgQ1);
        q2Img = findViewById(R.id.imgQ2);
        q3Img = findViewById(R.id.imgQ3);
        q4Img = findViewById(R.id.imgQ4);
        q5Img = findViewById(R.id.imgQ5);
        q6Img = findViewById(R.id.imgQ6);
        q7Img = findViewById(R.id.imgQ7);
        q8Img = findViewById(R.id.imgQ8);
        q8But = findViewById(R.id.subQ8);
        q7R1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton1, boolean b) {
                if (q7R1.isChecked()) {
                    listenCheck += 1;
                    q7Check2();
                    q7R1.setEnabled(false);
                }
            }
        });
        q7R2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton2, boolean b) {

                if (q7R2.isChecked()) {
                    listenCheck += 1;
                    q7Check2();
                    q7R2.setEnabled(false);
                }
            }
        });
        q7R3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton3, boolean b) {
                if (q7R3.isChecked()) {
                    listenCheck -= 2;
                    q7Check2();
                    q7R3.setEnabled(false);
                }
            }
        });
        q7R4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton4, boolean b) {
                if (q7R4.isChecked()) {
                    listenCheck -= 2;
                    q7Check2();
                    q7R4.setEnabled(false);
                }
            }
        });
        correctState = (ContextCompat.getColorStateList(getApplicationContext(), R.color.radionbuttonstate));
        wrongState = (ContextCompat.getColorStateList(getApplicationContext(), R.color.radiobuttonwrong));
        checkAnswers();

//checking to see if all questions are answered
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final int plScore = score;
                if (!q1R1.isChecked() & !q1R2.isChecked() & !q1R3.isChecked() & !q1R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if (!q2R1.isChecked() & !q2R2.isChecked() & !q2R3.isChecked() & !q2R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if (!q3R1.isChecked() & !q3R2.isChecked() & !q3R3.isChecked() & !q3R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if (!q4R1.isChecked() & !q4R2.isChecked() & !q4R3.isChecked() & !q4R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if (!q5R1.isChecked() & !q5R2.isChecked() & !q5R3.isChecked() & !q5R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if (!q6R1.isChecked() & !q6R2.isChecked() & !q6R3.isChecked() & !q6R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if (!q7R1.isChecked() & !q7R2.isChecked() & !q7R3.isChecked() & !q7R4.isChecked()) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else if ((q8R1.getText().toString().toLowerCase().equals(""))) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.fail), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Your Total score is " + plScore + " out of 8!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //different switches for each question
    public void q1Check() {
        q1Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.q1RadioAnswer3:
                        score += 1;
                        q1R3.setTextColor(correctState);
                        q1Img.setImageResource(R.drawable.cska);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.q1RadioAnswer1:
                    case R.id.q1RadioAnswer2:
                    case R.id.q1RadioAnswer4:
                        q1R1.setTextColor(wrongState);
                        q1R2.setTextColor(wrongState);
                        q1R4.setTextColor(wrongState);
                        q1R3.setTextColor(correctState);
                        q1Img.setImageResource(R.drawable.cska);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct1), Toast.LENGTH_SHORT).show();
                        break;
                }
                q1R1.setEnabled(false);
                q1R2.setEnabled(false);
                q1R3.setEnabled(false);
                q1R4.setEnabled(false);
            }
        });
    }

    public void q2Check() {
        q2Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.q2RadioAnswer2:
                        score += 1;
                        q2R2.setTextColor(correctState);
                        q2Img.setImageResource(R.drawable.askriga);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.q2RadioAnswer1:
                    case R.id.q2RadioAnswer3:
                    case R.id.q2RadioAnswer4:
                        q2R1.setTextColor(wrongState);
                        q2R3.setTextColor(wrongState);
                        q2R4.setTextColor(wrongState);
                        q2R2.setTextColor(correctState);
                        q2Img.setImageResource(R.drawable.askriga);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct2), Toast.LENGTH_SHORT).show();
                        break;
                }
                q2R1.setEnabled(false);
                q2R2.setEnabled(false);
                q2R3.setEnabled(false);
                q2R4.setEnabled(false);
            }
        });
    }

    public void q3Check() {
        q3Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.q3RadioAnswer2:
                        score += 1;
                        q3R2.setTextColor(ContextCompat.getColorStateList(getApplicationContext(), R.color.radionbuttonstate));
                        q3Img.setImageResource(R.drawable.berlin);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.q3RadioAnswer1:
                    case R.id.q3RadioAnswer3:
                    case R.id.q3RadioAnswer4:
                        q3R1.setTextColor(wrongState);
                        q3R3.setTextColor(wrongState);
                        q3R4.setTextColor(wrongState);
                        q3R2.setTextColor(correctState);
                        q3Img.setImageResource(R.drawable.berlin);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct3), Toast.LENGTH_SHORT).show();
                }
                q3R1.setEnabled(false);
                q3R2.setEnabled(false);
                q3R3.setEnabled(false);
                q3R4.setEnabled(false);
            }
        });
    }

    public void q4Check() {
        q4Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.q4RadioAnswer1:
                        score += 1;
                        q4R1.setTextColor(correctState);
                        q4Img.setImageResource(R.drawable.real);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.q4RadioAnswer2:
                    case R.id.q4RadioAnswer3:
                    case R.id.q4RadioAnswer4:
                        q4R2.setTextColor(wrongState);
                        q4R3.setTextColor(wrongState);
                        q4R4.setTextColor(wrongState);
                        q4R1.setTextColor(correctState);
                        q4Img.setImageResource(R.drawable.real);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct4), Toast.LENGTH_SHORT).show();
                        break;
                }
                q4R1.setEnabled(false);
                q4R2.setEnabled(false);
                q4R3.setEnabled(false);
                q4R4.setEnabled(false);
            }
        });
    }

    public void q5Check() {
        q5Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.q5RadioAnswer2:
                        score += 1;
                        q5R2.setTextColor(correctState);
                        q5Img.setImageResource(R.drawable.manu);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.q5RadioAnswer1:
                    case R.id.q5RadioAnswer3:
                    case R.id.q5RadioAnswer4:
                        q5R1.setTextColor(wrongState);
                        q5R3.setTextColor(wrongState);
                        q5R4.setTextColor(wrongState);
                        q5R2.setTextColor(correctState);
                        q5Img.setImageResource(R.drawable.manu);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct5), Toast.LENGTH_SHORT).show();
                }
                q5R1.setEnabled(false);
                q5R2.setEnabled(false);
                q5R3.setEnabled(false);
                q5R4.setEnabled(false);
            }
        });
    }

    public void q6Check() {

        q6Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.q6RadioAnswer2:
                        score += 1;
                        q6R2.setTextColor(correctState);
                        q6Img.setImageResource(R.drawable.anderl);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.q6RadioAnswer1:
                    case R.id.q6RadioAnswer3:
                    case R.id.q6RadioAnswer4:
                        q6R1.setTextColor(wrongState);
                        q6R3.setTextColor(wrongState);
                        q6R4.setTextColor(wrongState);
                        q6R2.setTextColor(correctState);
                        q6Img.setImageResource(R.drawable.anderl);
                        Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct6), Toast.LENGTH_SHORT).show();
                }
                q6R1.setEnabled(false);
                q6R2.setEnabled(false);
                q6R3.setEnabled(false);
                q6R4.setEnabled(false);
            }
        });
    }

    //checkboxes if
    public void q7Check2() {
        if (listenCheck == 2) {
            score += 1;
            q7R1.setTextColor(correctState);
            q7R2.setTextColor(correctState);
            q7Img.setImageResource(R.drawable.ddvspan);
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.cheer), Toast.LENGTH_SHORT).show();
        } else if (listenCheck < 0) {
            q7R3.setTextColor(wrongState);
            q7R4.setTextColor(wrongState);
            q7Img.setImageResource(R.drawable.ddvspan);
            Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct7), Toast.LENGTH_SHORT).show();
        }

    }

    //edittext if
    public void q8Check() {
        q8But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((q8R1.getText().toString().toLowerCase().equals("reyes") | (q8R1.getText().toString().toLowerCase().equals("felipe reyes")))) {
                    score += 1;
                    q8Img.setImageResource(R.drawable.felipe);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct8), Toast.LENGTH_SHORT).show();
                } else {
                    q8Img.setImageResource(R.drawable.felipe);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.correct8_1), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //this method is called in onCreate
    public void checkAnswers() {
        q1Check();
        q2Check();
        q3Check();
        q4Check();
        q5Check();
        q6Check();
        q7Check2();
        q8Check();
    }
}

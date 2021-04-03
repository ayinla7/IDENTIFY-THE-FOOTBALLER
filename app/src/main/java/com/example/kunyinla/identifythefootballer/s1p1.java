package com.example.kunyinla.identifythefootballer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;
import android.preference.PreferenceManager;
import android.widget.Toast;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.PreferenceManager;

public class s1p1 extends AppCompatActivity {
    RadioButton ra1;
    RadioButton rb1;
    RadioButton rc1;
    RadioButton rd1;
    RadioGroup answer1;
    RadioButton ansbtn1;
    Button done1;
    Button next1;

    score score = new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p1);
        done1 = (Button) findViewById(R.id.done1);
        next1 = (Button) findViewById(R.id.next1);
        ra1 = (RadioButton) findViewById(R.id.ra1);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        RadioButton rc1 = (RadioButton) findViewById(R.id.rc1);
        RadioButton rd1 = (RadioButton) findViewById(R.id.rd1);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer1 = (RadioGroup) findViewById(R.id.answer1);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer1.getCheckedRadioButtonId();
                    ansbtn1 = (RadioButton) findViewById(selectedid1);
                    if (ra1.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done1.setEnabled(false);
                    //    score.addScore(rb1);

                }
            }
        });


        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(done1.isEnabled()==false) {
                    Intent int1 = new Intent(getApplicationContext(), s1p2.class);
                    startActivity(int1);
                }else{
                    Toast.makeText(getApplicationContext(), "DONE NOT SELECTED", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}


/*if(!(rb1.isChecked())) {
    rbt = selectedRadioButton.getText().toString();
                    if(rb1.isChecked()) {
        score.addScore(rb1);*/
package com.example.kunyinla.identifythefootballer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class s1p12 extends AppCompatActivity {
    RadioButton ra12;
    RadioButton rb12;
    RadioButton rc12;
    RadioButton rd12;
    RadioGroup answer12;
    RadioButton ansbtn12;
    Button done12;
    Button next12;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p12);
        next12 = (Button) findViewById(R.id.next12);
        done12 = (Button) findViewById(R.id.done12);
        ra12 = (RadioButton) findViewById(R.id.ra12);
        rb12 = (RadioButton) findViewById(R.id.rb12);
        rc12 = (RadioButton) findViewById(R.id.rc12);
        rd12 = (RadioButton) findViewById(R.id.rd12);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer12 = (RadioGroup) findViewById(R.id.answer12);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer12.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer12.getCheckedRadioButtonId();
                    ansbtn12 = (RadioButton) findViewById(selectedid1);
                    if (rc12.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done12.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), s1p13.class);
                startActivity(i1);


            }
        });
    }

}

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

public class s1p13 extends AppCompatActivity {

    RadioButton ra13;
    RadioButton rb13;
    RadioButton rc13;
    RadioButton rd13;
    RadioGroup answer13;
    RadioButton ansbtn13;
    Button done13;
    Button next13;
    score score = new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p13);
        next13 = (Button) findViewById(R.id.next13);
        done13 = (Button) findViewById(R.id.done13);
        ra13 = (RadioButton) findViewById(R.id.ra13);
        rb13 = (RadioButton) findViewById(R.id.rb13);
        rc13 = (RadioButton) findViewById(R.id.rc13);
        rd13 = (RadioButton) findViewById(R.id.rd13);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer13 = (RadioGroup) findViewById(R.id.answer13);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer13.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer13.getCheckedRadioButtonId();
                    ansbtn13 = (RadioButton) findViewById(selectedid1);
                    if (rd13.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done13.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), s1p14.class);

                startActivity(i1);

            }
        });
    }
}

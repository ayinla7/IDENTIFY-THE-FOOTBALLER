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

public class s1p11 extends AppCompatActivity {

    RadioButton ra11;
    RadioButton rb11;
    RadioButton rc11;
    RadioButton rd11;
    RadioGroup answer11;
    RadioButton ansbtn11;
    Button done11;
    Button next11;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p11);
        next11 = (Button) findViewById(R.id.next11);
        done11 = (Button) findViewById(R.id.done11);
        ra11 = (RadioButton) findViewById(R.id.ra11);
        rb11 = (RadioButton) findViewById(R.id.rb11);
        rc11 = (RadioButton) findViewById(R.id.rc11);
        rd11 = (RadioButton) findViewById(R.id.rd11);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer11 = (RadioGroup) findViewById(R.id.answer11);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer11.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer11.getCheckedRadioButtonId();
                    ansbtn11 = (RadioButton) findViewById(selectedid1);
                    if (ra11.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done11.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next11.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                    Intent i1 = new Intent(getApplicationContext(), s1p12.class);
                    startActivity(i1);
            }
        });
    }
}







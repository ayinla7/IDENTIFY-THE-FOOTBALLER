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

public class s1p16 extends AppCompatActivity {

    RadioButton ra16;
    RadioButton rb16;
    RadioButton rc16;
    RadioButton rd16;
    RadioGroup answer16;
    RadioButton ansbtn16;
    Button done16;
    Button next16;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p16);
        next16 = (Button) findViewById(R.id.next16);
        done16 = (Button) findViewById(R.id.done16);
        ra16 = (RadioButton) findViewById(R.id.ra16);
        rb16 = (RadioButton) findViewById(R.id.rb16);
        rc16 = (RadioButton) findViewById(R.id.rc16);
        rd16 = (RadioButton) findViewById(R.id.rd16);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer16 = (RadioGroup) findViewById(R.id.answer16);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer16.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer16.getCheckedRadioButtonId();
                    ansbtn16 = (RadioButton) findViewById(selectedid1);
                    if (rd16.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done16.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), s1p17.class);
                    startActivity(i1);


            }
        });
    }

}

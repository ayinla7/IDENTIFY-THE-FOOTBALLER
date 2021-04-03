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

public class s1p20 extends AppCompatActivity {

    RadioButton ra20;
    RadioButton rb20;
    RadioButton rc20;
    RadioButton rd20;
    RadioGroup answer20;
    RadioButton ansbtn20;
    Button done20;
    Button next20;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p20);
        next20 = (Button) findViewById(R.id.next20);
        done20 = (Button) findViewById(R.id.done20);
        ra20 = (RadioButton) findViewById(R.id.ra20);
        rb20 = (RadioButton) findViewById(R.id.rb20);
        rc20 = (RadioButton) findViewById(R.id.rc20);
        rd20 = (RadioButton) findViewById(R.id.rd20);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer20 = (RadioGroup) findViewById(R.id.answer20);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer20.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer20.getCheckedRadioButtonId();
                    ansbtn20 = (RadioButton) findViewById(selectedid1);
                    if (rb20.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done20.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), result2.class);
                    startActivity(i1);


            }
        });
    }
}

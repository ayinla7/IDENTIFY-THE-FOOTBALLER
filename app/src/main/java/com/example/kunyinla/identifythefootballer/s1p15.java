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

public class s1p15 extends AppCompatActivity {
    RadioButton ra15;
    RadioButton rb15;
    RadioButton rc15;
    RadioButton rd15;
    RadioGroup answer15;
    RadioButton ansbtn15;
    Button done15;
    Button next15;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p15);
        next15 = (Button) findViewById(R.id.next15);
        done15= (Button) findViewById(R.id.done15);
        ra15 = (RadioButton) findViewById(R.id.ra15);
        rb15 = (RadioButton) findViewById(R.id.rb15);
        rc15 = (RadioButton) findViewById(R.id.rc15);
        rd15 = (RadioButton) findViewById(R.id.rd15);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer15 = (RadioGroup) findViewById(R.id.answer15);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer15.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer15.getCheckedRadioButtonId();
                    ansbtn15 = (RadioButton) findViewById(selectedid1);
                    if (rb15.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done15.setEnabled(false);
                    //    score.addScore(rb1);

                }
            }
        });
        next15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), s1p16.class);
                startActivity(i1);

            }
        });
    }

}

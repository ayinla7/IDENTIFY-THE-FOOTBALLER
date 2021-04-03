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

public class s2p9 extends AppCompatActivity {

    RadioButton r2a9;
    RadioButton r2b9;
    RadioButton r2c9;
    RadioButton r2d9;
    RadioGroup answer9s2;
    RadioButton ansbtn9s2;
    Button done9s2; Button next9s2;

    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p9);
        next9s2 = (Button) findViewById(R.id.next9s2);
        done9s2 = (Button) findViewById(R.id.done9s2);
        r2a9 = (RadioButton) findViewById(R.id.r2a9);
        r2b9 = (RadioButton) findViewById(R.id.r2b9);
        r2c9 = (RadioButton) findViewById(R.id.r2c9);
        r2d9 = (RadioButton) findViewById(R.id.r2d9);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer9s2 = (RadioGroup) findViewById(R.id.answer9s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done9s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer9s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer9s2.getCheckedRadioButtonId();
                    ansbtn9s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2d9.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done9s2.setEnabled(false);    }
            }
        });

        next9s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p10.class);
                    startActivity(i1);

                }
                });
    }

}

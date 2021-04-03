package com.example.kunyinla.identifythefootballer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;


public class s2p1 extends AppCompatActivity {
    RadioButton r2a1;
    RadioButton r2b1;
    RadioButton r2c1;
    RadioButton r2d1;
    RadioGroup answer1s2;
    RadioButton ansbtn1s2;
    Button done1s2;
    Button next1s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p1);
        done1s2 = (Button) findViewById(R.id.done1s2);
        next1s2 = (Button) findViewById(R.id.next1s2);
        r2a1 = (RadioButton) findViewById(R.id.r2a1);
        r2b1 = (RadioButton) findViewById(R.id.r2b1);
        r2c1 = (RadioButton) findViewById(R.id.r2c1);
        r2d1 = (RadioButton) findViewById(R.id.r2d1);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer1s2 = (RadioGroup) findViewById(R.id.answer1s2);
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        done1s2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer1s2.getCheckedRadioButtonId();
                    ansbtn1s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2a1.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done1s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
            });

           next1s2.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s2p2.class);
                startActivity(i1);

            }
            });
    }
}

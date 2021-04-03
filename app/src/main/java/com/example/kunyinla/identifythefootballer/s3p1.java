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


public class s3p1 extends AppCompatActivity {
    RadioButton r3a1;
    RadioButton r3b1;
    RadioButton r3c1;
    RadioButton r3d1;
    RadioGroup answer1s3;
    RadioButton ansbtn1s3;
    Button done1s3;
    Button next1s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p1);
        done1s3 = (Button) findViewById(R.id.done1s3);
        next1s3 = (Button) findViewById(R.id.next1s3);
        r3a1 = (RadioButton) findViewById(R.id.r3a1);
        r3b1 = (RadioButton) findViewById(R.id.r3b1);
        r3c1 = (RadioButton) findViewById(R.id.r3c1);
        r3d1 = (RadioButton) findViewById(R.id.r3d1);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer1s3 = (RadioGroup) findViewById(R.id.answer1s3);
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        done1s3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer1s3.getCheckedRadioButtonId();
                    ansbtn1s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3d1.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done1s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next1s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p2.class);
                startActivity(i1);

            }
        });
    }
}

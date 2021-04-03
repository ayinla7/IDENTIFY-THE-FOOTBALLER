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

public class s3p9 extends AppCompatActivity {

    RadioButton r3a9;
    RadioButton r3b9;
    RadioButton r3c9;
    RadioButton r3d9;
    RadioGroup answer9s3;
    RadioButton ansbtn9s3;
    Button done9s3;
    Button next9s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p9);
        done9s3 = (Button) findViewById(R.id.done9s3);
        next9s3 = (Button) findViewById(R.id.next9s3);
        r3a9 = (RadioButton) findViewById(R.id.r3a9);
        r3b9 = (RadioButton) findViewById(R.id.r3b9);
        r3c9 = (RadioButton) findViewById(R.id.r3c9);
        r3d9 = (RadioButton) findViewById(R.id.r3d9);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer9s3 = (RadioGroup) findViewById(R.id.answer9s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done9s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer9s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer9s3.getCheckedRadioButtonId();
                    ansbtn9s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3d9.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done9s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next9s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p10.class);
                startActivity(i1);

            }
        });
    }
}

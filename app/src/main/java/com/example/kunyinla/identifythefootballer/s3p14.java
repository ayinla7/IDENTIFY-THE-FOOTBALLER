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

public class s3p14 extends AppCompatActivity {

    RadioButton r3a14;
    RadioButton r3b14;
    RadioButton r3c14;
    RadioButton r3d14;
    RadioGroup answer14s3;
    RadioButton ansbtn14s3;
    Button done14s3;
    Button next14s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p14);
        done14s3 = (Button) findViewById(R.id.done14s3);
        next14s3 = (Button) findViewById(R.id.next14s3);
        r3a14 = (RadioButton) findViewById(R.id.r3a14);
        r3b14 = (RadioButton) findViewById(R.id.r3b14);
        r3c14 = (RadioButton) findViewById(R.id.r3c14);
        r3d14 = (RadioButton) findViewById(R.id.r3d14);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer14s3 = (RadioGroup) findViewById(R.id.answer14s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done14s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer14s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer14s3.getCheckedRadioButtonId();
                    ansbtn14s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3b14.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done14s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next14s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p15.class);
                startActivity(i1);

            }
        });
    }
}

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

public class s3p5 extends AppCompatActivity {

    RadioButton r3a5;
    RadioButton r3b5;
    RadioButton r3c5;
    RadioButton r3d5;
    RadioGroup answer5s3;
    RadioButton ansbtn5s3;
    Button done5s3;
    Button next5s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p5);
        done5s3 = (Button) findViewById(R.id.done5s3);
        next5s3 = (Button) findViewById(R.id.next5s3);
        r3a5 = (RadioButton) findViewById(R.id.r3a5);
        r3b5 = (RadioButton) findViewById(R.id.r3b5);
        r3c5 = (RadioButton) findViewById(R.id.r3c5);
        r3d5 = (RadioButton) findViewById(R.id.r3d5);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer5s3 = (RadioGroup) findViewById(R.id.answer5s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done5s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer5s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer5s3.getCheckedRadioButtonId();
                    ansbtn5s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3b5.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done5s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next5s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p6.class);
                startActivity(i1);

            }
        });
    }
}

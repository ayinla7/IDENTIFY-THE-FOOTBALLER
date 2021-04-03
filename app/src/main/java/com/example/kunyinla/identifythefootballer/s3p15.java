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

public class s3p15 extends AppCompatActivity {

    RadioButton r3a15;
    RadioButton r3b15;
    RadioButton r3c15;
    RadioButton r3d15;
    RadioGroup answer15s3;
    RadioButton ansbtn15s3;
    Button done15s3;
    Button next15s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p15);
        done15s3 = (Button) findViewById(R.id.done15s3);
        next15s3 = (Button) findViewById(R.id.next15s3);
        r3a15 = (RadioButton) findViewById(R.id.r3a15);
        r3b15 = (RadioButton) findViewById(R.id.r3b15);
        r3c15 = (RadioButton) findViewById(R.id.r3c15);
        r3d15 = (RadioButton) findViewById(R.id.r3d15);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer15s3 = (RadioGroup) findViewById(R.id.answer15s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done15s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer15s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer15s3.getCheckedRadioButtonId();
                    ansbtn15s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3d15.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done15s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next15s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p16.class);
                startActivity(i1);

            }
        });
    }
}

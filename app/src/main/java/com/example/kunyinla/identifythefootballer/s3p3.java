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

public class s3p3 extends AppCompatActivity {

    RadioButton r3a3;
    RadioButton r3b3;
    RadioButton r3c3;
    RadioButton r3d3;
    RadioGroup answer3s3;
    RadioButton ansbtn3s3;
    Button done3s3;
    Button next3s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p3);
        done3s3 = (Button) findViewById(R.id.done3s3);
        next3s3 = (Button) findViewById(R.id.next3s3);
        r3a3 = (RadioButton) findViewById(R.id.r3a3);
        r3b3 = (RadioButton) findViewById(R.id.r3b3);
        r3c3 = (RadioButton) findViewById(R.id.r3c3);
        r3d3 = (RadioButton) findViewById(R.id.r3d3);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer3s3 = (RadioGroup) findViewById(R.id.answer3s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done3s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer3s3.getCheckedRadioButtonId();
                    ansbtn3s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3d3.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done3s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next3s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p4.class);
                startActivity(i1);

            }
        });
    }
}

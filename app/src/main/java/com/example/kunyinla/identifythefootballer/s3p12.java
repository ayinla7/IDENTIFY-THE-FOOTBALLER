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

public class s3p12 extends AppCompatActivity {

    RadioButton r3a12;
    RadioButton r3b12;
    RadioButton r3c12;
    RadioButton r3d12;
    RadioGroup answer12s3;
    RadioButton ansbtn12s3;
    Button done12s3;
    Button next12s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p12);
        done12s3 = (Button) findViewById(R.id.done12s3);
        next12s3 = (Button) findViewById(R.id.next12s3);
        r3a12 = (RadioButton) findViewById(R.id.r3a12);
        r3b12 = (RadioButton) findViewById(R.id.r3b12);
        r3c12 = (RadioButton) findViewById(R.id.r3c12);
        r3d12 = (RadioButton) findViewById(R.id.r3d12);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer12s3 = (RadioGroup) findViewById(R.id.answer12s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done12s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer12s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer12s3.getCheckedRadioButtonId();
                    ansbtn12s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3a12.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done12s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next12s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p13.class);
                startActivity(i1);

            }
        });
    }
}

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

public class s3p13 extends AppCompatActivity {

    RadioButton r3a13;
    RadioButton r3b13;
    RadioButton r3c13;
    RadioButton r3d13;
    RadioGroup answer13s3;
    RadioButton ansbtn13s3;
    Button done13s3;
    Button next13s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p13);
        done13s3 = (Button) findViewById(R.id.done13s3);
        next13s3 = (Button) findViewById(R.id.next13s3);
        r3a13 = (RadioButton) findViewById(R.id.r3a13);
        r3b13 = (RadioButton) findViewById(R.id.r3b13);
        r3c13 = (RadioButton) findViewById(R.id.r3c13);
        r3d13 = (RadioButton) findViewById(R.id.r3d13);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer13s3 = (RadioGroup) findViewById(R.id.answer13s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done13s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer13s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer13s3.getCheckedRadioButtonId();
                    ansbtn13s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3b13.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done13s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next13s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p14.class);
                startActivity(i1);

            }
        });
    }
}

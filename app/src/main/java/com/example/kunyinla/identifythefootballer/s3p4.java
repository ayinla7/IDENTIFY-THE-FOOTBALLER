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

public class s3p4 extends AppCompatActivity {

    RadioButton r3a4;
    RadioButton r3b4;
    RadioButton r3c4;
    RadioButton r3d4;
    RadioGroup answer4s3;
    RadioButton ansbtn4s3;
    Button done4s3;
    Button next4s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p4);
        done4s3 = (Button) findViewById(R.id.done4s3);
        next4s3 = (Button) findViewById(R.id.next4s3);
        r3a4 = (RadioButton) findViewById(R.id.r3a4);
        r3b4 = (RadioButton) findViewById(R.id.r3b4);
        r3c4 = (RadioButton) findViewById(R.id.r3c4);
        r3d4 = (RadioButton) findViewById(R.id.r3d4);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer4s3 = (RadioGroup) findViewById(R.id.answer4s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done4s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer4s3.getCheckedRadioButtonId();
                    ansbtn4s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3a4.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done4s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next4s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p5.class);
                startActivity(i1);

            }
        });
    }
}

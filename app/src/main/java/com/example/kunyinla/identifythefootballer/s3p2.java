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

public class s3p2 extends AppCompatActivity {

    RadioButton r3a2;
    RadioButton r3b2;
    RadioButton r3c2;
    RadioButton r3d2;
    RadioGroup answer2s3;
    RadioButton ansbtn2s3;
    Button done2s3;
    Button next2s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p2);
        done2s3 = (Button) findViewById(R.id.done2s3);
        next2s3 = (Button) findViewById(R.id.next2s3);
        r3a2 = (RadioButton) findViewById(R.id.r3a2);
        r3b2 = (RadioButton) findViewById(R.id.r3b2);
        r3c2 = (RadioButton) findViewById(R.id.r3c2);
        r3d2 = (RadioButton) findViewById(R.id.r3d2);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer2s3 = (RadioGroup) findViewById(R.id.answer2s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done2s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer2s3.getCheckedRadioButtonId();
                    ansbtn2s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3c2.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done2s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next2s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p3.class);
                startActivity(i1);

            }
        });
    }
}

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

public class s3p11 extends AppCompatActivity {

    RadioButton r3a11;
    RadioButton r3b11;
    RadioButton r3c11;
    RadioButton r3d11;
    RadioGroup answer11s3;
    RadioButton ansbtn11s3;
    Button done11s3;
    Button next11s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p11);
        done11s3 = (Button) findViewById(R.id.done11s3);
        next11s3 = (Button) findViewById(R.id.next11s3);
        r3a11 = (RadioButton) findViewById(R.id.r3a11);
        r3b11 = (RadioButton) findViewById(R.id.r3b11);
        r3c11 = (RadioButton) findViewById(R.id.r3c11);
        r3d11 = (RadioButton) findViewById(R.id.r3d11);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer11s3 = (RadioGroup) findViewById(R.id.answer11s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done11s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer11s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer11s3.getCheckedRadioButtonId();
                    ansbtn11s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3c11.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done11s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next11s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p12.class);
                startActivity(i1);

            }
        });
    }
}

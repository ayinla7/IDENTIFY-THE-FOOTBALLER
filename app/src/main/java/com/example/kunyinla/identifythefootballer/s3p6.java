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

public class s3p6 extends AppCompatActivity {

    RadioButton r3a6;
    RadioButton r3b6;
    RadioButton r3c6;
    RadioButton r3d6;
    RadioGroup answer6s3;
    RadioButton ansbtn6s3;
    Button done6s3;
    Button next6s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p6);
        done6s3 = (Button) findViewById(R.id.done6s3);
        next6s3 = (Button) findViewById(R.id.next6s3);
        r3a6 = (RadioButton) findViewById(R.id.r3a6);
        r3b6 = (RadioButton) findViewById(R.id.r3b6);
        r3c6 = (RadioButton) findViewById(R.id.r3c6);
        r3d6 = (RadioButton) findViewById(R.id.r3d6);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer6s3 = (RadioGroup) findViewById(R.id.answer6s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done6s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer6s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer6s3.getCheckedRadioButtonId();
                    ansbtn6s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3a6.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done6s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next6s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p7.class);
                startActivity(i1);

            }
        });
    }
}

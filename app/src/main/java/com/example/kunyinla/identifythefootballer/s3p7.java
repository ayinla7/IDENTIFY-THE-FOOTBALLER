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

public class s3p7 extends AppCompatActivity {

    RadioButton r3a7;
    RadioButton r3b7;
    RadioButton r3c7;
    RadioButton r3d7;
    RadioGroup answer7s3;
    RadioButton ansbtn7s3;
    Button done7s3;
    Button next7s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p7);
        done7s3 = (Button) findViewById(R.id.done7s3);
        next7s3 = (Button) findViewById(R.id.next7s3);
        r3a7 = (RadioButton) findViewById(R.id.r3a7);
        r3b7 = (RadioButton) findViewById(R.id.r3b7);
        r3c7 = (RadioButton) findViewById(R.id.r3c7);
        r3d7 = (RadioButton) findViewById(R.id.r3d7);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer7s3 = (RadioGroup) findViewById(R.id.answer7s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done7s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer7s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer7s3.getCheckedRadioButtonId();
                    ansbtn7s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3c7.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done7s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next7s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p8.class);
                startActivity(i1);

            }
        });
    }
}

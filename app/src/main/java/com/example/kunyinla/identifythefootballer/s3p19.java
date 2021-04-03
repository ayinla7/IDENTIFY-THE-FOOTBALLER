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

public class s3p19 extends AppCompatActivity {
RadioButton r3a19;
    RadioButton r3b19;
    RadioButton r3c19;
    RadioButton r3d19;
    RadioGroup answer19s3;
    RadioButton ansbtn19s3;
    Button done19s3;
    Button next19s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p19);
        done19s3 = (Button) findViewById(R.id.done19s3);
        next19s3 = (Button) findViewById(R.id.next19s3);
        r3a19 = (RadioButton) findViewById(R.id.r3a19);
        r3b19 = (RadioButton) findViewById(R.id.r3b19);
        r3c19 = (RadioButton) findViewById(R.id.r3c19);
        r3d19 = (RadioButton) findViewById(R.id.r3d19);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer19s3 = (RadioGroup) findViewById(R.id.answer19s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done19s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer19s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer19s3.getCheckedRadioButtonId();
                    ansbtn19s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3d19.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done19s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next19s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p20.class);
                startActivity(i1);

            }
        });
    }
}

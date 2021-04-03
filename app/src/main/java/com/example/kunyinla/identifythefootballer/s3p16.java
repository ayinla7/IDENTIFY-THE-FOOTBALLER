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

public class s3p16 extends AppCompatActivity {

    RadioButton r3a16;
    RadioButton r3b16;
    RadioButton r3c16;
    RadioButton r3d16;
    RadioGroup answer16s3;
    RadioButton ansbtn16s3;
    Button done16s3;
    Button next16s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p16);
        done16s3 = (Button) findViewById(R.id.done16s3);
        next16s3 = (Button) findViewById(R.id.next16s3);
        r3a16 = (RadioButton) findViewById(R.id.r3a16);
        r3b16 = (RadioButton) findViewById(R.id.r3b16);
        r3c16 = (RadioButton) findViewById(R.id.r3c16);
        r3d16 = (RadioButton) findViewById(R.id.r3d16);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer16s3 = (RadioGroup) findViewById(R.id.answer16s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done16s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer16s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer16s3.getCheckedRadioButtonId();
                    ansbtn16s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3d16.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done16s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next16s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p17.class);
                startActivity(i1);

            }
        });
    }
}

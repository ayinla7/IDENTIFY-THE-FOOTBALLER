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

public class s3p10 extends AppCompatActivity {

     RadioButton r3a10;
    RadioButton r3b10;
    RadioButton r3c10;
    RadioButton r3d10;
    RadioGroup answer10s3;
    RadioButton ansbtn10s3;
    Button done10s3;
    Button next10s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p10);
        done10s3 = (Button) findViewById(R.id.done10s3);
        next10s3 = (Button) findViewById(R.id.next10s3);
        r3a10 = (RadioButton) findViewById(R.id.r3a10);
        r3b10 = (RadioButton) findViewById(R.id.r3b10);
        r3c10 = (RadioButton) findViewById(R.id.r3c10);
        r3d10 = (RadioButton) findViewById(R.id.r3d10);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer10s3 = (RadioGroup) findViewById(R.id.answer10s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done10s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer10s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer10s3.getCheckedRadioButtonId();
                    ansbtn10s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3a10.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done10s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next10s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p11.class);
                startActivity(i1);

            }
        });
    }
}

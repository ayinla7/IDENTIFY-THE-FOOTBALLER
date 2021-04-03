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

public class s3p17 extends AppCompatActivity {

    RadioButton r3a17;
    RadioButton r3b17;
    RadioButton r3c17;
    RadioButton r3d17;
    RadioGroup answer17s3;
    RadioButton ansbtn17s3;
    Button done17s3;
    Button next17s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p17);
        done17s3 = (Button) findViewById(R.id.done17s3);
        next17s3 = (Button) findViewById(R.id.next17s3);
        r3a17 = (RadioButton) findViewById(R.id.r3a17);
        r3b17 = (RadioButton) findViewById(R.id.r3b17);
        r3c17 = (RadioButton) findViewById(R.id.r3c17);
        r3d17 = (RadioButton) findViewById(R.id.r3d17);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer17s3 = (RadioGroup) findViewById(R.id.answer17s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done17s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer17s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer17s3.getCheckedRadioButtonId();
                    ansbtn17s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3a17.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done17s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next17s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), sp18.class);
                startActivity(i1);

            }
        });
    }
}

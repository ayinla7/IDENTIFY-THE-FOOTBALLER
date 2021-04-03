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

public class sp18 extends AppCompatActivity {

    RadioButton r3a18;
    RadioButton r3b18;
    RadioButton r3c18;
    RadioButton r3d18;
    RadioGroup answer18s3;
    RadioButton ansbtn18s3;
    Button done18s3;
    Button next18s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp18);
        done18s3 = (Button) findViewById(R.id.done18s3);
        next18s3 = (Button) findViewById(R.id.next18s3);
        r3a18 = (RadioButton) findViewById(R.id.r3a18);
        r3b18 = (RadioButton) findViewById(R.id.r3b18);
        r3c18 = (RadioButton) findViewById(R.id.r3c18);
        r3d18 = (RadioButton) findViewById(R.id.r3d18);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer18s3 = (RadioGroup) findViewById(R.id.answer18s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done18s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer18s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer18s3.getCheckedRadioButtonId();
                    ansbtn18s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3a18.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done18s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next18s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), s3p19.class);
                startActivity(i1);

            }
        });
    }
}

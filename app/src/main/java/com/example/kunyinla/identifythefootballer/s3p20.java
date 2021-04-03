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

public class s3p20 extends AppCompatActivity {

    RadioButton r3a20;
    RadioButton r3b20;
    RadioButton r3c20;
    RadioButton r3d20;
    RadioGroup answer20s3;
    RadioButton ansbtn20s3;
    Button done20s3;
    Button next20s3;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s3p20);
        done20s3 = (Button) findViewById(R.id.done20s3);
        next20s3 = (Button) findViewById(R.id.next20s3);
        r3a20 = (RadioButton) findViewById(R.id.r3a20);
        r3b20 = (RadioButton) findViewById(R.id.r3b20);
        r3c20 = (RadioButton) findViewById(R.id.r3c20);
        r3d20 = (RadioButton) findViewById(R.id.r3d20);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer20s3 = (RadioGroup) findViewById(R.id.answer20s3);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done20s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer20s3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer20s3.getCheckedRadioButtonId();
                    ansbtn20s3 = (RadioButton) findViewById(selectedid1s2);
                    if (r3c20.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE3", sharedpreferences.getInt("SCORE3", 0) + 0);
                        k.apply();
                    }
                    done20s3.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next20s3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent i1 = new Intent(getApplicationContext(), result3g.class);
                startActivity(i1);

            }
        });
    }
}

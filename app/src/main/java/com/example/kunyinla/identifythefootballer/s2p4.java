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

public class s2p4 extends AppCompatActivity {
    RadioButton r2a4;
    RadioButton r2b4;
    RadioButton r2c4;
    RadioButton r2d4;
    RadioGroup answer4s2;
    RadioButton ansbtn4s2;
    Button done4s2; Button next4s2;
    SharedPreferences sharedpreferences;
    score score= new score();
    TextView txt;
    int selectedid1s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p4);
        next4s2 = (Button) findViewById(R.id.next4s2);
        done4s2 = (Button) findViewById(R.id.done4s2);
        r2a4 = (RadioButton) findViewById(R.id.r2a4);
        r2b4 = (RadioButton) findViewById(R.id.r2b4);
        r2c4 = (RadioButton) findViewById(R.id.r2c4);
        r2d4 = (RadioButton) findViewById(R.id.r2d4);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer4s2 = (RadioGroup) findViewById(R.id.answer4s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s4 = answer4s2.getCheckedRadioButtonId();
                    ansbtn4s2 = (RadioButton) findViewById(selectedid1s4);
                    if (r2b4.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done4s2.setEnabled(false);    }
            }
        });

        next4s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p5.class);
                    startActivity(i1);

                }
            });

    }
}

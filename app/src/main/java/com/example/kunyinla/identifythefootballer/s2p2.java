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

public class s2p2 extends AppCompatActivity {
    RadioButton r2a2;
    RadioButton r2b2;
    RadioButton r2c2;
    RadioButton r2d2;
    RadioGroup answer2s2;
    RadioButton ansbtn2s2;
    Button done2s2; Button next2s2;
    SharedPreferences sharedpreferences;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p2);
        next2s2 = (Button) findViewById(R.id.next2s2);
        done2s2 = (Button) findViewById(R.id.done2s2);
        r2a2 = (RadioButton) findViewById(R.id.r2a2);
        r2b2 = (RadioButton) findViewById(R.id.r2b2);
        r2c2 = (RadioButton) findViewById(R.id.r2c2);
        r2d2 = (RadioButton) findViewById(R.id.r2d2);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer2s2 = (RadioGroup) findViewById(R.id.answer2s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer2s2.getCheckedRadioButtonId();
                    ansbtn2s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2b2.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done2s2.setEnabled(false);    }
            }
        });

        next2s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p3.class);
                    startActivity(i1);

                }
            });
    }
}

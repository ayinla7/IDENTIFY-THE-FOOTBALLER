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

public class s2p15 extends AppCompatActivity {

    RadioButton r2a15;
    RadioButton r2b15;
    RadioButton r2c15;
    RadioButton r2d15;
    RadioGroup answer15s2;
    RadioButton ansbtn15s2;
    Button done15s2;
    Button next15s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p15);
        next15s2 = (Button) findViewById(R.id.next15s2);
        done15s2 = (Button) findViewById(R.id.done15s2);
        r2a15 = (RadioButton) findViewById(R.id.r2a15);
        r2b15 = (RadioButton) findViewById(R.id.r2b15);
        r2c15 = (RadioButton) findViewById(R.id.r2c15);
        r2d15 = (RadioButton) findViewById(R.id.r2d15);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer15s2 = (RadioGroup) findViewById(R.id.answer15s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done15s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer15s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer15s2.getCheckedRadioButtonId();
                    ansbtn15s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2c15.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done15s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next15s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p16.class);
                    startActivity(i1);

                }

        });
    }
}

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

public class s2p14 extends AppCompatActivity {

    RadioButton r2a14;
    RadioButton r2b14;
    RadioButton r2c14;
    RadioButton r2d14;
    RadioGroup answer14s2;
    RadioButton ansbtn14s2;
    Button done14s2;
    Button next14s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p14);
        next14s2 = (Button) findViewById(R.id.next14s2);
        done14s2 = (Button) findViewById(R.id.done14s2);
        r2a14 = (RadioButton) findViewById(R.id.r2a14);
        r2b14 = (RadioButton) findViewById(R.id.r2b14);
        r2c14 = (RadioButton) findViewById(R.id.r2c14);
        r2d14 = (RadioButton) findViewById(R.id.r2d14);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer14s2 = (RadioGroup) findViewById(R.id.answer14s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done14s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer14s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer14s2.getCheckedRadioButtonId();
                    ansbtn14s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2b14.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE", sharedpreferences.getInt("SCORE", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE", sharedpreferences.getInt("SCORE", 0) + 0);
                        k.apply();
                    }
                    done14s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next14s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p15.class);
                    startActivity(i1);

                }

        });
    }
}

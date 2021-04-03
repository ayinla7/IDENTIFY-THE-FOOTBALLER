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

public class s2p13 extends AppCompatActivity {

    RadioButton r2a13;
    RadioButton r2b13;
    RadioButton r2c13;
    RadioButton r2d13;
    RadioGroup answer13s2;
    RadioButton ansbtn13s2;
    Button done13s2;
    Button next13s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p13);
        next13s2 = (Button) findViewById(R.id.next13s2);
        done13s2 = (Button) findViewById(R.id.done13s2);
        r2a13 = (RadioButton) findViewById(R.id.r2a13);
        r2b13 = (RadioButton) findViewById(R.id.r2b13);
        r2c13 = (RadioButton) findViewById(R.id.r2c13);
        r2d13 = (RadioButton) findViewById(R.id.r2d13);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer13s2 = (RadioGroup) findViewById(R.id.answer13s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done13s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer13s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer13s2.getCheckedRadioButtonId();
                    ansbtn13s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2c13.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done13s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next13s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p14.class);
                    startActivity(i1);

                }

        });
    }
}

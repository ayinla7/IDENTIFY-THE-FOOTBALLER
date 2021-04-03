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
import android.view.View.OnClickListener;

public class s2p6 extends AppCompatActivity {
    RadioButton r2a6;
    RadioButton r2b6;
    RadioButton r2c6;
    RadioButton r2d6;
    RadioGroup answer6s2;
    RadioButton ansbtn6s2;
    Button done6s2; Button next6s2;
    SharedPreferences sharedpreferences;
    score score= new score();
    TextView txt;
    int selectedid1s6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p6);
        next6s2 = (Button) findViewById(R.id.next6s2);
        done6s2 = (Button) findViewById(R.id.done6s2);
        r2a6 = (RadioButton) findViewById(R.id.r2a6);
        r2b6 = (RadioButton) findViewById(R.id.r2b6);
        r2c6 = (RadioButton) findViewById(R.id.r2c6);
        r2d6 = (RadioButton) findViewById(R.id.r2d6);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer6s2 = (RadioGroup) findViewById(R.id.answer6s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done6s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer6s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s6 = answer6s2.getCheckedRadioButtonId();
                    ansbtn6s2 = (RadioButton) findViewById(selectedid1s6);
                    if (r2a6.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done6s2.setEnabled(false);    }
            }
        });

        next6s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p7.class);
                    startActivity(i1);

                }

        });

    }
}

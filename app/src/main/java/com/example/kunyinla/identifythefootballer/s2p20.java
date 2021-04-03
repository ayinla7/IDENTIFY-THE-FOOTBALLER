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

public class s2p20 extends AppCompatActivity {
    RadioButton r2a20;
    RadioButton r2b20;
    RadioButton r2c20;
    RadioButton r2d20;
    RadioGroup answer20s2;
    RadioButton ansbtn20s2;

    Button done20s2;
    Button next20s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p20);
        done20s2 = (Button) findViewById(R.id.done20s2);
        next20s2 = (Button) findViewById(R.id.next20s2);
        r2a20 = (RadioButton) findViewById(R.id.r2a20);
        r2b20 = (RadioButton) findViewById(R.id.r2b20);
        r2c20 = (RadioButton) findViewById(R.id.r2c20);
        r2d20 = (RadioButton) findViewById(R.id.r2d20);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer20s2 = (RadioGroup) findViewById(R.id.answer20s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done20s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer20s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer20s2.getCheckedRadioButtonId();
                    ansbtn20s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2c20.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done20s2.setEnabled(false);
                }
            }
        });

        next20s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), result3.class);
                    startActivity(i1);

                }

        });
    }
}

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

public class s2p11 extends AppCompatActivity {

    RadioButton r2a11;
    RadioButton r2b11;
    RadioButton r2c11;
    RadioButton r2d11;
    RadioGroup answer11s2;
    RadioButton ansbtn11s2;
    Button done11s2;
    Button next11s2;

    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p11);
        next11s2 = (Button) findViewById(R.id.next11s2);
        done11s2 = (Button) findViewById(R.id.done11s2);
        r2a11 = (RadioButton) findViewById(R.id.r2a11);
        r2b11 = (RadioButton) findViewById(R.id.r2b11);
        r2c11 = (RadioButton) findViewById(R.id.r2c11);
        r2d11 = (RadioButton) findViewById(R.id.r2d11);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer11s2 = (RadioGroup) findViewById(R.id.answer11s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done11s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer11s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer11s2.getCheckedRadioButtonId();
                    ansbtn11s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2a11.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done11s2.setEnabled(false);
                }
            }
        });

        next11s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p12.class);
                    startActivity(i1);

                }

        });
    }

}

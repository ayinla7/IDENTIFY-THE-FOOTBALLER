package com.example.kunyinla.identifythefootballer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;

public class s2p7 extends AppCompatActivity {

    RadioButton r2a7;
    RadioButton r2b7;
    RadioButton r2c7;
    RadioButton r2d7;
    RadioGroup answer7s2;
    RadioButton ansbtn7s2;
    Button done7s2; Button next7s2;

    score score= new score();
    TextView txt;
    int selectedid1s7;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p7);
        next7s2 = (Button) findViewById(R.id.next7s2);
        done7s2 = (Button) findViewById(R.id.done7s2);
        r2a7 = (RadioButton) findViewById(R.id.r2a7);
        r2b7 = (RadioButton) findViewById(R.id.r2b7);
        r2c7 = (RadioButton) findViewById(R.id.r2c7);
        r2d7 = (RadioButton) findViewById(R.id.r2d7);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer7s2 = (RadioGroup) findViewById(R.id.answer7s2);
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        done7s2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer7s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s7 = answer7s2.getCheckedRadioButtonId();
                    ansbtn7s2 = (RadioButton) findViewById(selectedid1s7);
                    if (r2a7.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done7s2.setEnabled(false);    }
            }
        });

        next7s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p8.class);
                    startActivity(i1);

                }

        });
    }

}

package com.example.kunyinla.identifythefootballer;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
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
public class s2p5 extends AppCompatActivity {
    RadioButton r2a5;
    RadioButton r2b5;
    RadioButton r2c5;
    RadioButton r2d5;
    RadioGroup answer5s2;
    RadioButton ansbtn5s2;
    Button done5s2; Button next5s2;
    SharedPreferences sharedpreferences;
    score score= new score();
    TextView txt;
    int selectedid1s5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p5);
        next5s2 = (Button) findViewById(R.id.next5s2);
        done5s2 = (Button) findViewById(R.id.done5s2);
        r2a5 = (RadioButton) findViewById(R.id.r2a5);
        r2b5 = (RadioButton) findViewById(R.id.r2b5);
        r2c5 = (RadioButton) findViewById(R.id.r2c5);
        r2d5 = (RadioButton) findViewById(R.id.r2d5);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer5s2 = (RadioGroup) findViewById(R.id.answer5s2);
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        done5s2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer5s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s5 = answer5s2.getCheckedRadioButtonId();
                    ansbtn5s2 = (RadioButton) findViewById(selectedid1s5);
                    if (r2d5.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done5s2.setEnabled(false);    }
            }
        });

        next5s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p6.class);
                    startActivity(i1);

                }
                });

    }
}

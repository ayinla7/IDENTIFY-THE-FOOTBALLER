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

public class s1p18 extends AppCompatActivity {

    RadioButton ra18;
    RadioButton rb18;
    RadioButton rc18;
    RadioButton rd18;
    RadioGroup answer18;
    RadioButton ansbtn18;
    Button done18;
    Button next18;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p18);
        next18 = (Button) findViewById(R.id.next18);
        done18 = (Button) findViewById(R.id.done18);
        ra18 = (RadioButton) findViewById(R.id.ra18);
        rb18 = (RadioButton) findViewById(R.id.rb18);
        rc18 = (RadioButton) findViewById(R.id.rc18);
        rd18 = (RadioButton) findViewById(R.id.rd18);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer18 = (RadioGroup) findViewById(R.id.answer18);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer18.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer18.getCheckedRadioButtonId();
                    ansbtn18 = (RadioButton) findViewById(selectedid1);
                    if (rc18.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done18.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), s1p19.class);
                    startActivity(i1);


            }
        });
    }
}

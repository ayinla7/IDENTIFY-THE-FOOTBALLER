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

public class s1p19 extends AppCompatActivity {
    RadioButton ra19;
    RadioButton rb19;
    RadioButton rc19;
    RadioButton rd19;
    RadioGroup answer19;
    RadioButton ansbtn19;
    Button done19;
    Button next19;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p19);
        next19 = (Button) findViewById(R.id.next19);
        done19 = (Button) findViewById(R.id.done19);
        ra19 = (RadioButton) findViewById(R.id.ra19);
        rb19 = (RadioButton) findViewById(R.id.rb19);
        rc19 = (RadioButton) findViewById(R.id.rc19);
        rd19 = (RadioButton) findViewById(R.id.rd19);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer19 = (RadioGroup) findViewById(R.id.answer19);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer19.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer19.getCheckedRadioButtonId();
                    ansbtn19 = (RadioButton) findViewById(selectedid1);
                    if (ra19.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done19.setEnabled(false);

                    //    score.addScore(rb1);
                }
            }
        });
        next19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), s1p20.class);
                    startActivity(i1);


            }
        });
    }
}

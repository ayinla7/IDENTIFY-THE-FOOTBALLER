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

public class s1p17 extends AppCompatActivity {

    RadioButton ra17;
    RadioButton rb17;
    RadioButton rc17;
    RadioButton rd17;
    RadioGroup answer17;
    RadioButton ansbtn17;
    Button done17;
    Button next17;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p17);
        next17 = (Button) findViewById(R.id.next17);
        done17 = (Button) findViewById(R.id.done17);
        ra17 = (RadioButton) findViewById(R.id.ra17);
        rb17 = (RadioButton) findViewById(R.id.rb17);
        rc17 = (RadioButton) findViewById(R.id.rc17);
        rd17 = (RadioButton) findViewById(R.id.rd17);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer17 = (RadioGroup) findViewById(R.id.answer17);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer17.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer17.getCheckedRadioButtonId();
                    ansbtn17 = (RadioButton) findViewById(selectedid1);
                    if (rb17.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done17.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });
        next17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), s1p18.class);
                    startActivity(i1);


            }
        });
    }

}

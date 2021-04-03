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

public class s1p14 extends AppCompatActivity {

    RadioButton ra14;
    RadioButton rb14;
    RadioButton rc14;
    RadioButton rd14;
    RadioGroup answer14;
    RadioButton ansbtn14;
    Button done14;
    Button next14;
    score score= new score();
    TextView txt;
    int selectedid1;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p14);
        next14 = (Button) findViewById(R.id.next14);
        done14 = (Button) findViewById(R.id.done14);
        ra14 = (RadioButton) findViewById(R.id.ra14);
        rb14 = (RadioButton) findViewById(R.id.rb14);
        rc14 = (RadioButton) findViewById(R.id.rc14);
        rd14= (RadioButton) findViewById(R.id.rd14);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer14 = (RadioGroup) findViewById(R.id.answer14);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer14.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1 = answer14.getCheckedRadioButtonId();
                    ansbtn14 = (RadioButton) findViewById(selectedid1);
                    if (rd14.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    done14.setEnabled(false);
                    //    score.addScore(rb1);

                }
            }
        });
        next14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(getApplicationContext(), s1p15.class);
                    startActivity(i1);


            }
        });
    }

}

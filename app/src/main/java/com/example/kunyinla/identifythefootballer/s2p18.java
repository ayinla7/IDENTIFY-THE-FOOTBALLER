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

public class s2p18 extends AppCompatActivity {

    RadioButton r2a18;
    RadioButton r2b18;
    RadioButton r2c18;
    RadioButton r2d18;
    RadioGroup answer18s2;
    RadioButton ansbtn18s2;
    Button done18s2;
    Button next18s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p18);
        next18s2 = (Button) findViewById(R.id.next18s2);
        done18s2 = (Button) findViewById(R.id.done18s2);
        r2a18 = (RadioButton) findViewById(R.id.r2a18);
        r2b18 = (RadioButton) findViewById(R.id.r2b18);
        r2c18 = (RadioButton) findViewById(R.id.r2c18);
        r2d18 = (RadioButton) findViewById(R.id.r2d18);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer18s2 = (RadioGroup) findViewById(R.id.answer18s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done18s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer18s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer18s2.getCheckedRadioButtonId();
                    ansbtn18s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2a18.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done18s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next18s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p19.class);
                    startActivity(i1);

                }

        });
    }
}

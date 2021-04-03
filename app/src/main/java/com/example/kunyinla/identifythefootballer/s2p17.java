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

public class s2p17 extends AppCompatActivity {

    RadioButton r2a17;
    RadioButton r2b17;
    RadioButton r2c17;
    RadioButton r2d17;
    RadioGroup answer17s2;
    RadioButton ansbtn17s2;
    Button done17s2;
    Button next17s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p17);
        next17s2 = (Button) findViewById(R.id.next17s2);
        done17s2 = (Button) findViewById(R.id.done17s2);
        r2a17 = (RadioButton) findViewById(R.id.r2a17);
        r2b17 = (RadioButton) findViewById(R.id.r2b17);
        r2c17 = (RadioButton) findViewById(R.id.r2c17);
        r2d17 = (RadioButton) findViewById(R.id.r2d17);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer17s2 = (RadioGroup) findViewById(R.id.answer17s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done17s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer17s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer17s2.getCheckedRadioButtonId();
                    ansbtn17s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2d17.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done17s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next17s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p18.class);
                    startActivity(i1);

                }

        });
    }
}

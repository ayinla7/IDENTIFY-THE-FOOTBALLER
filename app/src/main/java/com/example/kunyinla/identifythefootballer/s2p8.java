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

public class s2p8 extends AppCompatActivity {

    RadioButton r2a8;
    RadioButton r2b8;
    RadioButton r2c8;
    RadioButton r2d8;
    RadioGroup answer8s2;
    RadioButton ansbtn8s2;
    Button done8s2; Button next8s2;

    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p8);
        next8s2 = (Button) findViewById(R.id.next8s2);
        done8s2 = (Button) findViewById(R.id.done8s2);
        r2a8 = (RadioButton) findViewById(R.id.r2a8);
        r2b8 = (RadioButton) findViewById(R.id.r2b8);
        r2c8 = (RadioButton) findViewById(R.id.r2c8);
        r2d8 = (RadioButton) findViewById(R.id.r2d8);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer8s2 = (RadioGroup) findViewById(R.id.answer8s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done8s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer8s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer8s2.getCheckedRadioButtonId();
                    ansbtn8s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2d8.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done8s2.setEnabled(false);    }
            }
        });

        next8s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p9.class);
                    startActivity(i1);

                }


        });
    }

}

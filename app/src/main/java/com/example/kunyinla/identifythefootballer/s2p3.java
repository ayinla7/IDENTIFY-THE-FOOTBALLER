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
import android.view.View.OnClickListener;

public class s2p3 extends AppCompatActivity {
    RadioButton r2a3;
    RadioButton r2b3;
    RadioButton r2c3;
    RadioButton r2d3;
    RadioGroup answer3s2;
    RadioButton ansbtn3s2;
    Button done3s2; Button next3s2;
    SharedPreferences sharedpreferences;
    score score= new score();
    TextView txt;
    int selectedid1s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p3);
        next3s2 = (Button) findViewById(R.id.next3s2);
        done3s2 = (Button) findViewById(R.id.done3s2);
        r2a3 = (RadioButton) findViewById(R.id.r2a3);
        r2b3 = (RadioButton) findViewById(R.id.r2b3);
        r2c3 = (RadioButton) findViewById(R.id.r2c3);
        r2d3 = (RadioButton) findViewById(R.id.r2d3);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer3s2 = (RadioGroup) findViewById(R.id.answer3s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s3 = answer3s2.getCheckedRadioButtonId();
                    ansbtn3s2 = (RadioButton) findViewById(selectedid1s3);
                    if (r2c3.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done3s2.setEnabled(false);    }
            }
        });

        next3s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p4.class);
                    startActivity(i1);

            }

        });

    }
}

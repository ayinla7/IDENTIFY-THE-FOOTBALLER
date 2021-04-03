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

public class s2p10 extends AppCompatActivity {

    RadioButton r2a10;
    RadioButton r2b10;
    RadioButton r2c10;
    RadioButton r2d10;
    RadioGroup answer10s2;
    RadioButton ansbtn10s2;
    Button done10s2;
    Button next10s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p10);
        next10s2 = (Button) findViewById(R.id.next10s2);
        done10s2 = (Button) findViewById(R.id.done10s2);
        r2a10 = (RadioButton) findViewById(R.id.r2a10);
        r2b10 = (RadioButton) findViewById(R.id.r2b10);
        r2c10 = (RadioButton) findViewById(R.id.r2c10);
        r2d10 = (RadioButton) findViewById(R.id.r2d10);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer10s2 = (RadioGroup) findViewById(R.id.answer10s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done10s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer10s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer10s2.getCheckedRadioButtonId();
                    ansbtn10s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2b10.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE2", sharedpreferences.getInt("SCORE2", 0) + 0);
                        k.apply();
                    }
                    done10s2.setEnabled(false);    }
            }
        });

        next10s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    //    score.addScore(rb1);
                    Intent i1 = new Intent(getApplicationContext(), s2p11.class);
                    startActivity(i1);

                }
        });
    }

}

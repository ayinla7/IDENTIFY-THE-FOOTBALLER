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

public class s2p16 extends AppCompatActivity {

    RadioButton r2a16;
    RadioButton r2b16;
    RadioButton r2c16;
    RadioButton r2d16;
    RadioGroup answer16s2;
    RadioButton ansbtn16s2;
    Button done16s2;
    Button next16s2;
    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p16);
        next16s2 = (Button) findViewById(R.id.next16s2);
        done16s2 = (Button) findViewById(R.id.done16s2);
        r2a16 = (RadioButton) findViewById(R.id.r2a16);
        r2b16= (RadioButton) findViewById(R.id.r2b16);
        r2c16 = (RadioButton) findViewById(R.id.r2c16);
        r2d16 = (RadioButton) findViewById(R.id.r2d16);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer16s2 = (RadioGroup) findViewById(R.id.answer16s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done16s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer16s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer16s2.getCheckedRadioButtonId();
                    ansbtn16s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2c16.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE", sharedpreferences.getInt("SCORE", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE", sharedpreferences.getInt("SCORE", 0) + 0);
                        k.apply();
                    }
                    done16s2.setEnabled(false);
                    //    score.addScore(rb1);
                }
            }
        });

        next16s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p17.class);
                    startActivity(i1);

                }

        });
    }
}

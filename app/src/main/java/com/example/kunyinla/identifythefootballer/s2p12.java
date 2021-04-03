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

public class s2p12 extends AppCompatActivity {

    RadioButton r2a12;
    RadioButton r2b12;
    RadioButton r2c12;
    RadioButton r2d12;
    RadioGroup answer12s2;
    RadioButton ansbtn12s2;
    Button done12s2;Button next12s2;


    score score= new score();
    TextView txt;
    int selectedid1s2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2p12);
        next12s2 = (Button) findViewById(R.id.next12s2);
        done12s2 = (Button) findViewById(R.id.done12s2);
        r2a12 = (RadioButton) findViewById(R.id.r2a12);
        r2b12 = (RadioButton) findViewById(R.id.r2b12);
        r2c12= (RadioButton) findViewById(R.id.r2c12);
        r2d12 = (RadioButton) findViewById(R.id.r2d12);


        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer12s2 = (RadioGroup) findViewById(R.id.answer12s2);
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        done12s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer12s2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    selectedid1s2 = answer12s2.getCheckedRadioButtonId();
                    ansbtn12s2 = (RadioButton) findViewById(selectedid1s2);
                    if (r2b12.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE", sharedpreferences.getInt("SCORE", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE", sharedpreferences.getInt("SCORE", 0) + 0);
                        k.apply();
                    }
                    done12s2.setEnabled(false);
                    //
                }
            }
        });

        next12s2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                    Intent i1 = new Intent(getApplicationContext(), s2p13.class);
                    startActivity(i1);

                }

        });
    }
}

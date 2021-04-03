package com.example.kunyinla.identifythefootballer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Switch;
import android.preference.PreferenceManager;
import android.widget.Toast;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.PreferenceManager;


public class s1p4 extends AppCompatActivity {

    RadioButton ra4;
    RadioButton rb4;
    RadioButton rc4;
    RadioButton rd4;
    RadioGroup answer4;
    RadioButton ansbtn4;
    Button done4;
    Button next4;
    score score = new score();
    TextView txt;
    int selectedid4; private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p4);
        next4 = (Button) findViewById(R.id.next4);
        done4 = (Button) findViewById(R.id.done4);
        ra4 = (RadioButton) findViewById(R.id.ra4);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rc4 = (RadioButton) findViewById(R.id.rc4);
        rd4 = (RadioButton) findViewById(R.id.rd4);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer4 = (RadioGroup) findViewById(R.id.answer4);
        done4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (rd4.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid4 = answer4.getCheckedRadioButtonId();
                    ansbtn4 = (RadioButton) findViewById(selectedid4);
                    done4.setEnabled(false);
                }
            }
        });
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i4 = new Intent(getApplicationContext(), s1p5.class);
                    startActivity(i4);


            }
        });
    }
        //TextView txt = (TextView) findViewById(R.id.txt);
        //String go = String.valueOf(score.getscore());
        //txt.setText(go);
    }


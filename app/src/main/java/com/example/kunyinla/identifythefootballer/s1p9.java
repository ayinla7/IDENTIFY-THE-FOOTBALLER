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


public class s1p9 extends AppCompatActivity {

    RadioButton ra9;
    RadioButton rb9;
    RadioButton rc9;
    RadioButton rd9;
    RadioGroup answer9;
    RadioButton ansbtn9;
    Button done9;
    Button next9;
    score score = new score();
    TextView txt;
    int selectedid9;
    private SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p9);
        next9 = (Button) findViewById(R.id.next9);
        done9 = (Button) findViewById(R.id.done9);
        ra9 = (RadioButton) findViewById(R.id.ra9);
        rb9 = (RadioButton) findViewById(R.id.rb9);
        rc9 = (RadioButton) findViewById(R.id.rc9);
        rd9 = (RadioButton) findViewById(R.id.rd9);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer9 = (RadioGroup) findViewById(R.id.answer9);
        done9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer9.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (rd9.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid9 = answer9.getCheckedRadioButtonId();
                    ansbtn9 = (RadioButton) findViewById(selectedid9);
                    done9.setEnabled(false);
                }
            }
        });
        next9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i9 = new Intent(getApplicationContext(), s1p10.class);
                    startActivity(i9);


            }
        });
    }
}

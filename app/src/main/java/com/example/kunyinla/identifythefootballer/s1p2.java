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


public class s1p2 extends AppCompatActivity {
    RadioButton ra2;
    RadioButton rb2;
    RadioButton rc2;
    RadioButton rd2;
    RadioGroup answer2;
    RadioButton ansbtn2;
    Button done2;
    Button next2;

    score score = new score();
    TextView txt;
    int selectedid2;
    private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p2);
        next2 = (Button) findViewById(R.id.next2);
        done2 = (Button) findViewById(R.id.done2);
        ra2 = (RadioButton) findViewById(R.id.ra2);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rc2 = (RadioButton) findViewById(R.id.rc2);
        rd2 = (RadioButton) findViewById(R.id.rd2);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer2 = (RadioGroup) findViewById(R.id.answer2);
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        done2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
                } else {
                    if (rc2.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    } else {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid2 = answer2.getCheckedRadioButtonId();
                    ansbtn2 = (RadioButton) findViewById(selectedid2);
                    done2.setEnabled(false);
                }
            }
            });
             next2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i2 = new Intent(getApplicationContext(), s1p3.class);
                    startActivity(i2);

            }
        });
    }
}



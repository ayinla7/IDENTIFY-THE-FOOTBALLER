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


public class s1p7 extends AppCompatActivity {
    RadioButton ra7;
    RadioButton rb7;
    RadioButton rc7;
    RadioButton rd7;
    RadioGroup answer7;
    RadioButton ansbtn7;
    Button done7;
    Button next7;
    score score = new score();
    TextView txt;
    int selectedid7;
    private SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE); super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p7);
        next7 = (Button) findViewById(R.id.next7);
        done7 = (Button) findViewById(R.id.done7);
        ra7 = (RadioButton) findViewById(R.id.ra7);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        rc7 = (RadioButton) findViewById(R.id.rc7);
        rd7 = (RadioButton) findViewById(R.id.rd7);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer7 = (RadioGroup) findViewById(R.id.answer7);
        done7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer7.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (rc7.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid7 = answer7.getCheckedRadioButtonId();
                    ansbtn7 = (RadioButton) findViewById(selectedid7);
                    done7.setEnabled(false);
                }
            }
        });
        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i7 = new Intent(getApplicationContext(), s1p8.class);
                    startActivity(i7);


            }
        });
    }
}

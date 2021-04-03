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


public class s1p8 extends AppCompatActivity {
    RadioButton ra8;
    RadioButton rb8;
    RadioButton rc8;
    RadioButton rd8;
    RadioGroup answer8;
    RadioButton ansbtn8;
    Button done8;
    Button next8;
    score score = new score();
    TextView txt;
    int selectedid8;
    private SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p8);
        next8 = (Button) findViewById(R.id.next8);
        done8 = (Button) findViewById(R.id.done8);
        ra8 = (RadioButton) findViewById(R.id.ra8);
        rb8 = (RadioButton) findViewById(R.id.rb8);
        rc8 = (RadioButton) findViewById(R.id.rc8);
        rd8 = (RadioButton) findViewById(R.id.rd8);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer8 = (RadioGroup) findViewById(R.id.answer8);
        done8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer8.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (ra8.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid8 = answer8.getCheckedRadioButtonId();
                    ansbtn8 = (RadioButton) findViewById(selectedid8);
                    done8.setEnabled(false);
                }
            }
        });
        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i8 = new Intent(getApplicationContext(), s1p9.class);
                    startActivity(i8);


            }
        });
    }
}

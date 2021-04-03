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


public class s1p3 extends AppCompatActivity {


    RadioButton ra3;
    RadioButton rb3;
    RadioButton rc3;
    RadioButton rd3;
    RadioGroup answer3;
    RadioButton ansbtn3;
    Button done3;
    score score = new score();
    TextView txt;
    Button next3;
    int selectedid3; private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p3);
        next3 = (Button) findViewById(R.id.next3);
        done3 = (Button) findViewById(R.id.done3);
        ra3 = (RadioButton) findViewById(R.id.ra3);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rc3 = (RadioButton) findViewById(R.id.rc3);
        rd3 = (RadioButton) findViewById(R.id.rd3);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        answer3 = (RadioGroup) findViewById(R.id.answer3);
        done3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (rd3.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid3 = answer3.getCheckedRadioButtonId();
                    ansbtn3 = (RadioButton) findViewById(selectedid3);
                    done3.setEnabled(false);
                }
            }
        });
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i3 = new Intent(getApplicationContext(), s1p4.class);
                    startActivity(i3);


            }
        });
    }
}

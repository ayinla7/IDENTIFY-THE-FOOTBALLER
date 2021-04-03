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


public class s1p10 extends AppCompatActivity {
    RadioButton ra10;
    RadioButton rb10;
    RadioButton rc10;
    RadioButton rd10;
    RadioGroup answer10;
    RadioButton ansbtn10;
    Button done10;
    Button next10;

    score score = new score();
    TextView txt;
    int selectedid10;
    private SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p10);
        next10 = (Button) findViewById(R.id.next10);
        done10 = (Button) findViewById(R.id.done10);
        ra10 = (RadioButton) findViewById(R.id.ra10);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rc10 = (RadioButton) findViewById(R.id.rc10);
        rd10 = (RadioButton) findViewById(R.id.rd10);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer10 = (RadioGroup) findViewById(R.id.answer10);
        done10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer10.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (rb10.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }

                    done10.setEnabled(false);
                    selectedid10 = answer10.getCheckedRadioButtonId();
                    ansbtn10 = (RadioButton) findViewById(selectedid10);
                }
            }
        });
        next10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i10 = new Intent(getApplicationContext(), s1p11.class);
                    startActivity(i10);


            }
        });
    }
}


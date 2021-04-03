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


public class s1p5 extends AppCompatActivity {

        RadioButton ra5;
        RadioButton rb5;
        RadioButton rc5;
        RadioButton rd5;
        RadioGroup answer5;
        RadioButton ansbtn5;
        Button done5;
    Button next5;
        score score = new score();
        TextView txt;
        int selectedid5; private SharedPreferences sharedpreferences;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_s1p5);
            next5 = (Button) findViewById(R.id.next5);
            done5 = (Button) findViewById(R.id.done5);
            ra5 = (RadioButton) findViewById(R.id.ra5);
            rb5 = (RadioButton) findViewById(R.id.rb5);
            rc5 = (RadioButton) findViewById(R.id.rc5);
            rd5 = (RadioButton) findViewById(R.id.rd5);
            addListenerOnButton();


        }


    public void addListenerOnButton() {
        answer5 = (RadioGroup) findViewById(R.id.answer5);
        done5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer5.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (rb5.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid5 = answer5.getCheckedRadioButtonId();
                    ansbtn5 = (RadioButton) findViewById(selectedid5);
                    done5.setEnabled(false);
                }
            }
        });
        next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i5 = new Intent(getApplicationContext(), s1p6.class);
                    startActivity(i5);

            }
        });
    }

}

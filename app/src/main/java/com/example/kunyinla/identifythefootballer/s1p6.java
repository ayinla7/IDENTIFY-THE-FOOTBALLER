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


public class s1p6 extends AppCompatActivity {
    RadioButton ra6;
    RadioButton rb6;
    RadioButton rc6;
    RadioButton rd6;
    RadioGroup answer6;
    RadioButton ansbtn6;
    Button done6;
    Button next6;
    score score = new score();
    TextView txt;
    int selectedid6; private SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedpreferences = getSharedPreferences("my",Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1p6);
        next6 = (Button) findViewById(R.id.next6);
        done6 = (Button) findViewById(R.id.done6);
        ra6 = (RadioButton) findViewById(R.id.ra6);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rc6 = (RadioButton) findViewById(R.id.rc6);
        rd6 = (RadioButton) findViewById(R.id.rd6);
        addListenerOnButton();


    }


    public void addListenerOnButton() {
        answer6 = (RadioGroup) findViewById(R.id.answer6);

        done6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer6.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select an ANSWER", Toast.LENGTH_SHORT).show();
                } else {
                    if (ra6.isChecked()) {
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 1);
                        k.apply();
                    }else{
                        SharedPreferences.Editor k = sharedpreferences.edit();

                        k.putInt("SCORE1", sharedpreferences.getInt("SCORE1", 0) + 0);
                        k.apply();
                    }
                    selectedid6 = answer6.getCheckedRadioButtonId();
                    ansbtn6 = (RadioButton) findViewById(selectedid6);
                    done6.setEnabled(false);
                }
            }
        });
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i6 = new Intent(getApplicationContext(), s1p7.class);
                    startActivity(i6);


            }
        });
    }
}

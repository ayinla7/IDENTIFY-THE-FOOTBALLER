package com.example.kunyinla.identifythefootballer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView tx;
    TextView tx1;
    TextView tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button stage1=(Button) findViewById(R.id.stage1);
        Button stage3=(Button) findViewById(R.id.stage3);
        Button stage4=(Button) findViewById(R.id.stage4);
        Button stage2=(Button)findViewById(R.id.stage2);
        Button clear=(Button)findViewById(R.id.clear);
         tx= (TextView)findViewById(R.id.tx);
         tx1= (TextView)findViewById(R.id.tx1);
         tx2= (TextView)findViewById(R.id.tx2);
        stage1.setEnabled(true);
        SharedPreferences sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        int score = sharedpreferences.getInt("SCORE1", 0);
        if(score>16) {
            stage2.setEnabled(true);
            stage1.setEnabled(false);
            String go = String.valueOf(score);
            tx.setText(go);
        }
        sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        int score2 = sharedpreferences.getInt("SCORE2", 0);
        if(score2>16) {
            stage3.setEnabled(true);
            stage1.setEnabled(false);
            stage2.setEnabled(false);
            String go = String.valueOf(score2);
            tx1.setText(go);
        }

         sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        int score3 = sharedpreferences.getInt("SCORE3", 0);
        if(score3>16) {
            stage3.setEnabled(false);
            stage1.setEnabled(false);
            stage2.setEnabled(false);
            stage4.setEnabled(true);
            String go = String.valueOf(score3);
            tx2.setText(go);
        }





        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
              //  int score = sharedpreferences.getInt("SCORE", 0);
                SharedPreferences.Editor k = sharedpreferences.edit();
                int s1=sharedpreferences.getInt("SCORE1", 0)-sharedpreferences.getInt("SCORE1", 0);
                int s2=sharedpreferences.getInt("SCORE2", 0)-sharedpreferences.getInt("SCORE2", 0);
                int s3=sharedpreferences.getInt("SCORE3", 0)-sharedpreferences.getInt("SCORE3", 0);
                k.putInt("SCORE1", s1);
                k.putInt("SCORE2", s2);
                k.putInt("SCORE3", s3);
                k.apply();
                int h1=sharedpreferences.getInt("SCORE1", 0);
                int h2=sharedpreferences.getInt("SCORE2", 0);
                int h3=sharedpreferences.getInt("SCORE3", 0);
                String gxa = String.valueOf(h1);
                String gxb = String.valueOf(h2);
                String gxc = String.valueOf(h3);
                tx.setText(gxa);
                tx1.setText(gxb);
                tx2.setText(gxc);

                       }
        });

        stage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(getApplicationContext(),s1p1.class);
                startActivity(int1);
            }
        });

        stage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(getApplicationContext(),s2p1.class);
                startActivity(int2);
            }
        });
        stage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(getApplicationContext(),s3p1.class);
                startActivity(int3);
            }
        });
    }



}

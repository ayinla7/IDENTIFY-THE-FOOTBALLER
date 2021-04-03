package com.example.kunyinla.identifythefootballer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.content.Context;


public class result2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        Button nextstage2=(Button)findViewById(R.id.nextstage2);
        Button retry2=(Button)findViewById(R.id.retry2);
        TextView txt2=(TextView)findViewById(R.id.txt2);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        SharedPreferences sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        int score = sharedpreferences.getInt("SCORE1",0);


        retry2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
                SharedPreferences.Editor k = sharedpreferences.edit();
                int s=sharedpreferences.getInt("SCORE1", 0)-sharedpreferences.getInt("SCORE1", 0);
                k.putInt("SCORE1", s);
                k.apply();
                Intent r=new Intent(getApplicationContext(),home.class);
                startActivity(r);
            }
        });
        if(score<9){
            nextstage2.setEnabled(false);
            txt2.setText("EHYA,,PLEASE TRY AGAIN!");
            imageView.setImageResource(R.drawable.failed);

        }else{
            imageView.setImageResource(R.drawable.check);
            txt2.setText("WOW,IMTERESTING!!!");
            nextstage2.setEnabled(true);
            nextstage2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent r=new Intent(getApplicationContext(),home.class);
                    startActivity(r);


                }
            });


        }

        String go = String.valueOf(score);
        TextView txt = (TextView) findViewById(R.id.txt);
        txt.setText(go);

    }
}

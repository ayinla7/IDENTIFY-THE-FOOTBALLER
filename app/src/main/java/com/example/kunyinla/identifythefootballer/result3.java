package com.example.kunyinla.identifythefootballer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class result3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result3);
        Button nextstage3=(Button)findViewById(R.id.nextstage3);
        Button retry3=(Button)findViewById(R.id.retry3);
        TextView txt2=(TextView)findViewById(R.id.txt2);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        SharedPreferences sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        int score = sharedpreferences.getInt("SCORE2",0);


        retry3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
                SharedPreferences.Editor k = sharedpreferences.edit();
                int s=sharedpreferences.getInt("SCORE2", 0)-sharedpreferences.getInt("SCORE2", 0);
                k.putInt("SCORE2", s);
                k.apply();
                Intent r=new Intent(getApplicationContext(),home.class);
                startActivity(r);
            }
        });
        if(score>16){
            nextstage3.setEnabled(false);
            txt2.setText("EHYA,,PLEASE TRY AGAIN!");
            imageView.setImageResource(R.drawable.failed);

        }else{
            imageView.setImageResource(R.drawable.check);
            txt2.setText("WOW,IMTERESTING!!!");
            nextstage3.setEnabled(true);
            nextstage3.setOnClickListener(new View.OnClickListener() {
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

package com.example.kunyinla.identifythefootballer;

import android.widget.RadioButton;

/**
 * Created by KUNYINLA on 22/08/2017.
 */

public class score {
   private static int score;
    score(){
        score=0;
    }
    public void addScore(RadioButton s) {
        int res=0;
        if (s.isChecked()){
            score++;
        }
        else{
            score+=0;
        }

    }
    public static int getscore(){
        int y=score;
        return y;
    }
}

package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int score=0;
    private int score2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void points3(View view){
        score+=3;
        updateScore();
    }

    public void points2(View view){
        score+=2;
        updateScore();
    }

    public void freethrow(View view){
        score++;
        updateScore();
    }

    public void points3_2(View view){
        score2+=3;
        updateScore2();
    }

    public void points2_2(View view){
        score2+=2;
        updateScore2();
    }

    public void freethrow_2(View view){
        score2++;
        updateScore2();
    }

    public void reset(View view){
        score=0;
        score2=0;
        updateScore();
        updateScore2();
    }

    public void updateScore() {
        TextView tv = (TextView) findViewById(R.id.score);
        tv.setText(String.valueOf(score));
    }

    public void updateScore2(){

        TextView tv2 = (TextView) findViewById(R.id.score2);
        tv2.setText(String.valueOf(score2));
    }
}

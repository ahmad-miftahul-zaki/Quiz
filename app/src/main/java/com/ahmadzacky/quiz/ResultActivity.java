package com.ahmadzacky.quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Window;

public class ResultActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_result);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You scored " + score + " out of " + QuizLibrary.mQuestions.length);

        if (score == 10){
            mGrade.setText("Muttaqin");
        }else if (score == 9){
            mGrade.setText("Mukhlis");
        }else if (score == 8) {
            mGrade.setText("Mukhsin");
        }else if (score == 7){
            mGrade.setText("Mukmin");
        }else if (score == 6){
            mGrade.setText("Muslim");
        }else {
            mGrade.setText("Islam KTP");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, QuizActivity.class));
                ResultActivity.this.finish();
            }
        });

        mysong = MediaPlayer.create(ResultActivity.this, R.raw.alhamdulillah);
        mysong.setLooping(true);
        mysong.start();
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(6000);
                } catch (Exception c) {
                    c.printStackTrace();
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mysong.release();
        finish();
    }
}

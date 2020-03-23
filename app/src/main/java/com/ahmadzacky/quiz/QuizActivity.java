package com.ahmadzacky.quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Window;

public class QuizActivity extends AppCompatActivity {

    private QuizLibrary mQuizLibrary = new QuizLibrary();
    private SoundPlayer sound;
    private TextView mScoreView;
    private ImageView mImageView;
    private TextView mQuestionView;
    private Button mButtonChoice0;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    MediaPlayer mysong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_quiz);
        sound = new SoundPlayer(this);
        mScoreView = (TextView)findViewById(R.id.score);
        mImageView = (ImageView) findViewById(R.id.imageView);
        mQuestionView = (TextView) findViewById(R.id.textView);
        mButtonChoice0 = (Button)findViewById(R.id.choice0);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();


        mButtonChoice0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice0.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    sound.playcorrSound();
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();

                    }
                }
                else {
                    sound.playwronSound();
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);

                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    sound.playcorrSound();
                    updateScore(mScore);
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    sound.playwronSound();
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    sound.playcorrSound();
                    updateScore(mScore);
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    sound.playwronSound();
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    sound.playcorrSound();
                    updateScore(mScore);
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    sound.playwronSound();
                    if (mQuestionNumber == QuizLibrary.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        mysong = MediaPlayer.create(QuizActivity.this, R.raw.tomboati);
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


    private void updateQuestion(){
        mImageView.setImageResource(mQuizLibrary.getImages(mQuestionNumber));
        mQuestionView.setText(mQuizLibrary.getQuestion(mQuestionNumber));
        mButtonChoice0.setText(mQuizLibrary.getChoice0(mQuestionNumber));
        mButtonChoice1.setText(mQuizLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuizLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuizLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuizLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
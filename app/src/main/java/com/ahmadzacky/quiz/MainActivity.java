package com.ahmadzacky.quiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    Button pstartButton;
    MediaPlayer mysong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        pstartButton = (Button) findViewById(R.id.startButton);
        pstartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QuizActivity.class));
            }
        });
        mysong = MediaPlayer.create(MainActivity.this, R.raw.assalamualaikum);
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

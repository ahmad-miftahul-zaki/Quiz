package com.ahmadzacky.quiz;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundPlayer {
    private static SoundPool soundPool;
    private static int corrSound;
    private static int wronSound;

    public SoundPlayer(Context context){
        soundPool = new SoundPool(2,AudioManager.STREAM_MUSIC,0);

        corrSound = soundPool.load(context, R.raw.benar,1);
        wronSound = soundPool.load(context, R.raw.salah,1);
    }

    public void playcorrSound(){
        soundPool.play(corrSound, 1.0f,1.0f,1,0,1.0f);
    }

    public void playwronSound(){
        soundPool.play(wronSound, 1.0f,1.0f,1,0,1.0f);
    }
}
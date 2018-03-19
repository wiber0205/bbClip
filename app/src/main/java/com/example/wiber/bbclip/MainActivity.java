package com.example.wiber.bbclip;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SoundPool sound = new SoundPool(100, AudioManager.STREAM_MUSIC, 0);
    ArrayList<Integer> isac_guckdaeno_list = new ArrayList<Integer>();
    ArrayList<Integer> gyonchar_list = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_1, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_2, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_3, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_4, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_5, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_6, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_7, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_8, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_9, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_10, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_11, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_12, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_13, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_14, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_15, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_16, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_17, 1));
        isac_guckdaeno_list.add(sound.load(this, R.raw.isac_guckdaeno_18, 1));

        gyonchar_list.add(sound.load(this, R.raw.gyonchar_1, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_2, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_3, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_4, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_5, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_6, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_7, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_8, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_9, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_10, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_11, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_12, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_13, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_14, 1));
        gyonchar_list.add(sound.load(this, R.raw.gyonchar_15, 1));

    }

    public void onclick_isac_guckdaeno_1(View v) {
        sound.play(isac_guckdaeno_list.get(0), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_2(View v) {
        sound.play(isac_guckdaeno_list.get(1), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_3(View v) {
        sound.play(isac_guckdaeno_list.get(2), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_4(View v) {
        sound.play(isac_guckdaeno_list.get(3), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_5(View v) {
        sound.play(isac_guckdaeno_list.get(4), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_6(View v) {
        sound.play(isac_guckdaeno_list.get(5), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_7(View v) {
        sound.play(isac_guckdaeno_list.get(6), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_8(View v) {
        sound.play(isac_guckdaeno_list.get(7), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_9(View v) {
        sound.play(isac_guckdaeno_list.get(8), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_10(View v) {
        sound.play(isac_guckdaeno_list.get(9), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_11(View v) {
        sound.play(isac_guckdaeno_list.get(10), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_12(View v) {
        sound.play(isac_guckdaeno_list.get(11), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_13(View v) {
        sound.play(isac_guckdaeno_list.get(12), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_14(View v) {
        sound.play(isac_guckdaeno_list.get(13), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_15(View v) {
        sound.play(isac_guckdaeno_list.get(14), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_16(View v) {
        sound.play(isac_guckdaeno_list.get(15), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_17(View v) {
        sound.play(isac_guckdaeno_list.get(16), 1, 1, 0, 0, 0);
    }
    public void onclick_isac_guckdaeno_18(View v) {
        sound.play(isac_guckdaeno_list.get(17), 1, 1, 0, 0, 0);
    }

    public void onclick_gyonchar_1(View v) {
        sound.play(gyonchar_list.get(0), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_2(View v) {
        sound.play(gyonchar_list.get(1), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_3(View v) {
        sound.play(gyonchar_list.get(2), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_4(View v) {
        sound.play(gyonchar_list.get(3), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_5(View v) {
        sound.play(gyonchar_list.get(4), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_6(View v) {
        sound.play(gyonchar_list.get(5), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_7(View v) {
        sound.play(gyonchar_list.get(6), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_8(View v) {
        sound.play(gyonchar_list.get(7), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_9(View v) {
        sound.play(gyonchar_list.get(8), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_10(View v) {
        sound.play(gyonchar_list.get(9), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_11(View v) {
        sound.play(gyonchar_list.get(10), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_12(View v) {
        sound.play(gyonchar_list.get(11), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_13(View v) {
        sound.play(gyonchar_list.get(12), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_14(View v) {
        sound.play(gyonchar_list.get(13), 1, 1, 0, 0, 0);
    }
    public void onclick_gyonchar_15(View v) {
        sound.play(gyonchar_list.get(14), 1, 1, 0, 0, 0);
    }


}

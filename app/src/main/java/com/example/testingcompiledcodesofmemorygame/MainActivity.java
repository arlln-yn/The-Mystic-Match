package com.example.testingcompiledcodesofmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private boolean isMusicOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("settings", MODE_PRIVATE);

        // Check the state of the music and sound switches
        isMusicOn = sharedPreferences.getBoolean("music_switch_state", true);
        boolean isSoundOn = sharedPreferences.getBoolean("sound_switch_state", true);

        if (isMusicOn) {
            MusicPlayerManager.startMusic(getApplicationContext());
        } else {
            MusicPlayerManager.stopMusic();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Ensure music is started again if it's on
        if (isMusicOn) {
            MusicPlayerManager.startMusic(getApplicationContext());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MusicPlayerManager.stopMusic();
    }

    public void start(View v) {
        Intent i = new Intent(this, difficultyLevel.class);
        startActivity(i);

    }

    public void settings(View v) {
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
        finish();
    }

    public void exit(View v) {
        MusicPlayerManager.stopMusic();
        // Finish the current activity
        finish();
    }
}

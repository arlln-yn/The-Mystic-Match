package com.example.testingcompiledcodesofmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class Settings extends AppCompatActivity {

    ImageView sound;
    ImageView music;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        sharedPreferences = getSharedPreferences("settings", MODE_PRIVATE);

        Switch soundSwitch = findViewById(R.id.soundSwitch);
        sound = findViewById(R.id.soundButton);

        Switch musicSwitch = findViewById(R.id.musicSwitch);
        music = findViewById(R.id.musicButton);

        // Load the saved settings states
        boolean defaultSoundState = sharedPreferences.getBoolean("sound_switch_state", true);
        boolean defaultMusicState = sharedPreferences.getBoolean("music_switch_state", true);

        // Update the switches and image views based on the retrieved states
        soundSwitch.setChecked(defaultSoundState);
        musicSwitch.setChecked(defaultMusicState);
        sound.setImageResource(defaultSoundState ? R.drawable.sound_on : R.drawable.sound_off);
        music.setImageResource(defaultMusicState ? R.drawable.music_icon_on : R.drawable.music_icon_off);

        // Set a listener on soundSwitch to update the state of soundButton
        soundSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sharedPreferences.edit().putBoolean("sound_switch_state", isChecked).apply();
                sound.setImageResource(isChecked ? R.drawable.sound_on : R.drawable.sound_off);
                EasyMode.flipSound(getApplicationContext());
            }
        });

        // Set a listener on musicSwitch to update the state of musicButton and control music playback
        musicSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sharedPreferences.edit().putBoolean("music_switch_state", isChecked).apply();
                music.setImageResource(isChecked ? R.drawable.music_icon_on : R.drawable.music_icon_off);
                if (isChecked) {
                    MusicPlayerManager.startMusic(getApplicationContext());
                } else {
                    MusicPlayerManager.stopMusic();
                }
            }
        });
    }

    public void backToMainMenu(View v){
        // No need to edit SharedPreferences here
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish(); // finish() will close the Settings activity and prevent it from being shown again when back button is clicked
    }
}

package com.example.testingcompiledcodesofmemorygame;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MusicPlayerManager {
    private static MediaPlayer mediaPlayer;

    public static void startMusic(Context context) {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(context, R.raw.bg_music);
            mediaPlayer.setLooping(true);
        }
        mediaPlayer.start();
    }

    public static void pauseMusic() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    public static void stopMusic() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}


package com.example.testingcompiledcodesofmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class difficultyLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_level);
    }

    public void easy (View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.easymode_dialog, null);
        TextView textViewMessage = dialogView.findViewById(R.id.textViewMessage);
        Button buttonProceed = dialogView.findViewById(R.id.buttonProceed);
        Button buttonBack = dialogView.findViewById(R.id.buttonBack);

        builder.setView(dialogView);
        builder.setCancelable(false);

        final AlertDialog dialog = builder.create();

        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), EasyMode.class);
                startActivity(i);
                finish();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void medium (View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.mediummode_dialog, null);
        TextView textViewMessage = dialogView.findViewById(R.id.textViewMessage);
        Button buttonProceed = dialogView.findViewById(R.id.buttonProceed);
        Button buttonBack = dialogView.findViewById(R.id.buttonBack);

        builder.setView(dialogView);
        builder.setCancelable(false);

        final AlertDialog dialog = builder.create();

        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), MediumMode.class);
                startActivity(i);
                finish();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void hard (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.hardmode_dialog, null);
        TextView textViewMessage = dialogView.findViewById(R.id.textViewMessage);
        Button buttonProceed = dialogView.findViewById(R.id.buttonProceed);
        Button buttonBack = dialogView.findViewById(R.id.buttonBack);

        builder.setView(dialogView);
        builder.setCancelable(false);

        final AlertDialog dialog = builder.create();

        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), HardMode.class);
                startActivity(i);
                finish();
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    public void BackToMainMenu(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
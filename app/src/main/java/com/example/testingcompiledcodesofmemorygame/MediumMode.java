package com.example.testingcompiledcodesofmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;

import java.util.Arrays;
import java.util.Collections;

public class MediumMode extends AppCompatActivity {

    TextView score;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24,
            iv_31, iv_32, iv_33, iv_34, iv_41, iv_42, iv_43, iv_44;

    // array for images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108,
            201, 202, 203, 204, 205, 206, 207, 208};

    // actual images
    int img101, img102, img103, img104, img105, img106, img107, img108,
            img201, img202, img203, img204, img205, img206, img207, img208;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    // for timer
    private TextView timerTextView;
    private CountDownTimer countDownTimer;

    int playerScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_mode);

        // Start countdown before showing the game
        startCountdown();

        timerTextView = findViewById(R.id.timer);

        score = findViewById(R.id.score);

        // First card set
        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_14 = findViewById(R.id.iv_14);

        // Second card set
        iv_21 = findViewById(R.id.iv_21);
        iv_22 = findViewById(R.id.iv_22);
        iv_23 = findViewById(R.id.iv_23);
        iv_24 = findViewById(R.id.iv_24);

        // Third card set
        iv_31 = findViewById(R.id.iv_31);
        iv_32 = findViewById(R.id.iv_32);
        iv_33 = findViewById(R.id.iv_33);
        iv_34 = findViewById(R.id.iv_34);

        // Fourth card set
        iv_41 = findViewById(R.id.iv_41);
        iv_42 = findViewById(R.id.iv_42);
        iv_43 = findViewById(R.id.iv_43);
        iv_44 = findViewById(R.id.iv_44);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");

        //load the card images
        frontOfCardResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_41, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_42, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_43, theCard);
                flipSound(getApplicationContext());
            }
        });

        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_44, theCard);
                flipSound(getApplicationContext());
            }
        });
    }

    public static void flipSound(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
        boolean isSoundOn = sharedPreferences.getBoolean("sound_switch_state", true);
        if (!isSoundOn) {
            return; // If sound toggle is off, return without playing sound
        }

        final MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.card_flip_sound);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release(); // Release resources when sound finishes playing
            }
        });
        mediaPlayer.start();
    }

    // Countdown methods
    private void startCountdown() {
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                // Show the countdown dialog
                showCountdownDialog();
            }
        });
    }

    private void showCountdownDialog() {
        // Create a custom dialog with your layout
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.countdown_dialog);

        // Find the TextView in your custom layout
        TextView textView = dialog.findViewById(R.id.textView);

        // Show the dialog
        dialog.show();
        dialog.setCancelable(false);

        // Create a handler to update the message with countdown
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            int count = 3;

            @Override
            public void run() {
                if (count >= 0) {
                    // Update the message with the countdown
                    textView.setText((count == 0 ? "GO" : String.valueOf(count)));
                    count--;
                    // Call the runnable again after 1 second
                    handler.postDelayed(this, 1000);
                } else {
                    // Dismiss the dialog when countdown is finished
                    dialog.dismiss();
                    // Start the game timer after countdown finishes
                    startTimer(30000); // Start the timer for 30 seconds
                }
            }
        }, 1000); // Start after 1 second
    }



    // timer methods
    private long timeLeftInMillis; // Variable to store remaining time during the countdown
    private void startTimer(long milliseconds) {
        if (timeRemaining > 0) {
            // Resume timer with remaining time
            countDownTimer = new CountDownTimer(timeRemaining, 1000) {
                public void onTick(long millisUntilFinished) {
                    timeLeftInMillis = millisUntilFinished;
                    updateTimerText(millisUntilFinished);
                }
                public void onFinish() {
                    timerTextView.setText("00:00");
                    // game ends
                    checkTimerEnd();
                }
            }.start();
        } else {
            // Start a new timer
            timeLeftInMillis = milliseconds;
            countDownTimer = new CountDownTimer(milliseconds, 1000) {
                public void onTick(long millisUntilFinished) {
                    timeLeftInMillis = millisUntilFinished;
                    updateTimerText(millisUntilFinished);
                }
                public void onFinish() {
                    timerTextView.setText("00:00");
                    // game ends
                    checkTimerEnd();
                }
            }.start();
        }
    }


    private void updateTimerText(long millisecondsUntilFinished) {
        long seconds = millisecondsUntilFinished / 1000;
        long minutes = seconds / 60;
        seconds = seconds % 60;
        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        timerTextView.setText(timeLeftFormatted);
    }

    private void stopTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private long timeRemaining; // Variable to store remaining time when pausing the timer

    private void pauseTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
            // Calculate the remaining time
            timeRemaining = timeLeftInMillis;
        }
    }

    private void resumeTimer() {
        // Start the timer again or resume it depending on your timer implementation
        if (timeRemaining > 0) {
            startTimer(timeRemaining);
        }
    }


    // memory card game methods
    private void doStuff(ImageView iv, int card){

        // Create flip animation objects
        final AnimatorSet flipToFront = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.flip_to_front);
        final AnimatorSet flipToBack = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.flip_to_back);

        // Set the target ImageView for animations
        flipToFront.setTarget(iv);
        flipToBack.setTarget(iv);


        if(cardsArray[card] == 101){
            iv.setImageResource(img101);
        } else if (cardsArray[card] == 102){
            iv.setImageResource(img102);
        } else if (cardsArray[card] == 103){
            iv.setImageResource(img103);
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(img104);
        } else if (cardsArray[card] == 105){
            iv.setImageResource(img105);
        } else if (cardsArray[card] == 106){
            iv.setImageResource(img106);
        } else if (cardsArray[card] == 107){
            iv.setImageResource(img107);
        } else if (cardsArray[card] == 108){
            iv.setImageResource(img108);
        } else if (cardsArray[card] == 201){
            iv.setImageResource(img201);
        } else if (cardsArray[card] == 202){
            iv.setImageResource(img202);
        } else if (cardsArray[card] == 203){
            iv.setImageResource(img203);
        } else if (cardsArray[card] == 204){
            iv.setImageResource(img204);
        } else if (cardsArray[card] == 205){
            iv.setImageResource(img205);
        } else if (cardsArray[card] == 206){
            iv.setImageResource(img206);
        } else if (cardsArray[card] == 207){
            iv.setImageResource(img207);
        } else if (cardsArray[card] == 208){
            iv.setImageResource(img208);
        }

        // Start the flip animation to front
        flipToFront.start();

        // check which image is selected and save it into temporary variables
        if(cardNumber == 1){
            firstCard = cardsArray[card];
            if(firstCard > 200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run(){
                    if(firstCard == secondCard) {
                        // If the cards match, directly call calculate() without flip animations
                        calculate();
                    } else {
                        // If the cards don't match, perform flip animations and then call calculate()
                        // Create AnimatorSet objects for flipping back both cards
                        AnimatorSet flipFirstBack = (AnimatorSet) AnimatorInflater.loadAnimator(MediumMode.this, R.animator.flip_to_front);
                        AnimatorSet flipSecondBack = (AnimatorSet) AnimatorInflater.loadAnimator(MediumMode.this, R.animator.flip_to_back);

                        // Set the target ImageView for animations
                        flipFirstBack.setTarget(findViewById(getImageViewId(clickedFirst)));
                        flipSecondBack.setTarget(findViewById(getImageViewId(clickedSecond)));

                        // Start flip animations for both cards simultaneously
                        flipFirstBack.start();
                        flipSecondBack.start();

                        // Check if the selected images are equal
                        calculate();
                    }
                }
            }, 500);
        }
    }

    // Method to get ImageView ID based on clicked card tag
    private int getImageViewId(int clickedCard) {
        switch (clickedCard) {
            case 0: return R.id.iv_11;
            case 1: return R.id.iv_12;
            case 2: return R.id.iv_13;
            case 3: return R.id.iv_14;
            case 4: return R.id.iv_21;
            case 5: return R.id.iv_22;
            case 6: return R.id.iv_23;
            case 7: return R.id.iv_24;
            case 8: return R.id.iv_31;
            case 9: return R.id.iv_32;
            case 10: return R.id.iv_33;
            case 11: return R.id.iv_34;
            case 12: return R.id.iv_41;
            case 13: return R.id.iv_42;
            case 14: return R.id.iv_43;
            case 15: return R.id.iv_44;
            default: return -1;
        }
    }

    // To see if both cards match
    private void calculate(){
        // if images are equal, remove them and add score
        if(firstCard == secondCard) {
            // Get the ImageView references based on clicked indices
            ImageView firstImageView = findViewById(getImageViewId(clickedFirst));
            ImageView secondImageView = findViewById(getImageViewId(clickedSecond));

            // Check if the images are not yet invisible
            if (firstImageView.getVisibility() != View.INVISIBLE || secondImageView.getVisibility() != View.INVISIBLE) {
                // Apply fade-out animation to the clicked cards
                Animation fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_card);
                firstImageView.startAnimation(fadeOutAnimation);
                secondImageView.startAnimation(fadeOutAnimation);

                // Make the clicked cards invisible after the animation finishes
                fadeOutAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        firstImageView.setVisibility(View.INVISIBLE);
                        secondImageView.setVisibility(View.INVISIBLE);

                        // Check if the game has ended
                        checkGameEnd();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

            // Add points
            playerScore++;
            score.setText("Score: " + playerScore);

        } else {
            iv_11.setImageResource(R.drawable.cardbg);
            iv_12.setImageResource(R.drawable.cardbg);
            iv_13.setImageResource(R.drawable.cardbg);
            iv_14.setImageResource(R.drawable.cardbg);
            iv_21.setImageResource(R.drawable.cardbg);
            iv_22.setImageResource(R.drawable.cardbg);
            iv_23.setImageResource(R.drawable.cardbg);
            iv_24.setImageResource(R.drawable.cardbg);
            iv_31.setImageResource(R.drawable.cardbg);
            iv_32.setImageResource(R.drawable.cardbg);
            iv_33.setImageResource(R.drawable.cardbg);
            iv_34.setImageResource(R.drawable.cardbg);
            iv_41.setImageResource(R.drawable.cardbg);
            iv_42.setImageResource(R.drawable.cardbg);
            iv_43.setImageResource(R.drawable.cardbg);
            iv_44.setImageResource(R.drawable.cardbg);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);
    }

    // Timer Ends
    private void checkTimerEnd() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.game_over_dialog, null);
        TextView textViewTitle = dialogView.findViewById(R.id.textViewTitle);
        TextView textViewMessage = dialogView.findViewById(R.id.textView);
        Button buttonTryAgain = dialogView.findViewById(R.id.buttonTryAgain);
        Button buttonMainMenu = dialogView.findViewById(R.id.buttonMainMenu);

        textViewMessage.setText("Your score: " + playerScore);

        builder.setView(dialogView);
        builder.setCancelable(false);

        final AlertDialog dialog = builder.create();

        buttonTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), MediumMode.class);
                startActivity(i);
                finish();
            }
        });

        buttonMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        dialog.show();
    }


    @Override
    protected void onDestroy () {
        super.onDestroy();
        stopTimer(); // Stop the timer
    }

    private void frontOfCardResources () {

        img101 = R.drawable.card1;
        img102 = R.drawable.card2;
        img103 = R.drawable.card3;
        img104 = R.drawable.card4;
        img105 = R.drawable.card5;
        img106 = R.drawable.card6;
        img107 = R.drawable.card7;
        img108 = R.drawable.card8;

        img201 = R.drawable.card1dup;
        img202 = R.drawable.card2dup;
        img203 = R.drawable.card3dup;
        img204 = R.drawable.card4dup;
        img205 = R.drawable.card5dup;
        img206 = R.drawable.card6dup;
        img207 = R.drawable.card7dup;
        img208 = R.drawable.card8dup;

    }


    // If players manage to match all cards
    private boolean areAllCardsInvisible() {
        // Check if all image views representing cards are invisible
        return iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE &&
                iv_41.getVisibility() == View.INVISIBLE &&
                iv_42.getVisibility() == View.INVISIBLE &&
                iv_43.getVisibility() == View.INVISIBLE &&
                iv_44.getVisibility() == View.INVISIBLE;
    }

    private void checkGameEnd() {
        if (areAllCardsInvisible()) {
            // All cards are invisible, indicating the end of the game
            // Stop timer
            stopTimer();
            // Perform actions to signify the end of the game, such as displaying a message or resetting the game
            displayEndGameMessage();
        }
    }

    private void displayEndGameMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().inflate(R.layout.congratulations_dialog, null);
        TextView textViewTitle = dialogView.findViewById(R.id.textViewTitle);
        TextView textViewMessage = dialogView.findViewById(R.id.textView);
        Button buttonTryAgain = dialogView.findViewById(R.id.buttonTryAgain);
        Button buttonMainMenu = dialogView.findViewById(R.id.buttonMainMenu);

        textViewMessage.setText("Your score: " + playerScore);

        builder.setView(dialogView);
        builder.setCancelable(false);

        final AlertDialog dialog = builder.create();

        buttonTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), MediumMode.class);
                startActivity(i);
                finish();
            }
        });

        buttonMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        dialog.show();
    }

    public void InGameBack (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        pauseTimer(); // Pause the timer when the dialog is displayed
        View dialogView = getLayoutInflater().inflate(R.layout.back_dialog, null);
        TextView textViewMessage = dialogView.findViewById(R.id.textViewMessage);
        Button buttonYes = dialogView.findViewById(R.id.buttonYes);
        Button buttonNo = dialogView.findViewById(R.id.buttonNo);

        builder.setView(dialogView);
        builder.setCancelable(false);

        final AlertDialog dialog = builder.create();

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                startCountdown();
                showCountdownDialog();

            }
        });
        dialog.show();
    }
}
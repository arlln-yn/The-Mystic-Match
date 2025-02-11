package com.example.testingcompiledcodesofmemorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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

public class HardMode extends AppCompatActivity {

    TextView score;

    ImageView crd_11, crd_12, crd_13, crd_14, crd_21, crd_22, crd_23, crd_24,
            crd_31, crd_32, crd_33, crd_34, crd_41, crd_42, crd_43, crd_44,
            crd_51, crd_52, crd_53, crd_54;

    // array for images
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
            201, 202, 203, 204, 205, 206, 207, 208, 209, 210};

    // actual images
    int img101, img102, img103, img104, img105, img106, img107, img108, img109, img110,
            img201, img202, img203, img204, img205, img206, img207, img208, img209, img210;

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
        setContentView(R.layout.activity_hard_mode);
        // Start countdown before showing the game
        startCountdown();

        timerTextView = findViewById(R.id.timer);

        score = findViewById(R.id.score);

        // First card set
        crd_11 = findViewById(R.id.crd_11);
        crd_12 = findViewById(R.id.crd_12);
        crd_13 = findViewById(R.id.crd_13);
        crd_14 = findViewById(R.id.crd_14);


        // Second card set
        crd_21 = findViewById(R.id.crd_21);
        crd_22 = findViewById(R.id.crd_22);
        crd_23 = findViewById(R.id.crd_23);
        crd_24 = findViewById(R.id.crd_24);

        // Third card set
        crd_31 = findViewById(R.id.crd_31);
        crd_32 = findViewById(R.id.crd_32);
        crd_33 = findViewById(R.id.crd_33);
        crd_34 = findViewById(R.id.crd_34);


        // Fourth card set
        crd_41 = findViewById(R.id.crd_41);
        crd_42 = findViewById(R.id.crd_42);
        crd_43 = findViewById(R.id.crd_43);
        crd_44 = findViewById(R.id.crd_44);


        // Fifth card set
        crd_51 = findViewById(R.id.crd_51);
        crd_52 = findViewById(R.id.crd_52);
        crd_53 = findViewById(R.id.crd_53);
        crd_54 = findViewById(R.id.crd_54);


        crd_11.setTag("0");
        crd_12.setTag("1");
        crd_13.setTag("2");
        crd_14.setTag("3");

        crd_21.setTag("4");
        crd_22.setTag("5");
        crd_23.setTag("6");
        crd_24.setTag("7");

        crd_31.setTag("8");
        crd_32.setTag("9");
        crd_33.setTag("10");
        crd_34.setTag("11");

        crd_41.setTag("12");
        crd_42.setTag("13");
        crd_43.setTag("14");
        crd_44.setTag("15");

        crd_51.setTag("16");
        crd_52.setTag("17");
        crd_53.setTag("18");
        crd_54.setTag("19");


        //load the card images
        frontOfCardResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        crd_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_11, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_12, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_13, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_14, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_21, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_22, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_23, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_24, theCard);
                flipSound(getApplicationContext());
            }
        });


        crd_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_31, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_32, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_33, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_34, theCard);
                flipSound(getApplicationContext());
            }
        });


        crd_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_41, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_42, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_43, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_44, theCard);
                flipSound(getApplicationContext());
            }
        });


        crd_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_51, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_52, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_53, theCard);
                flipSound(getApplicationContext());
            }
        });

        crd_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(crd_54, theCard);
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
        } else if (cardsArray[card] == 108) {
            iv.setImageResource(img108);
        }else if (cardsArray[card] == 109){
            iv.setImageResource(img109);
        } else if (cardsArray[card] == 110){
            iv.setImageResource(img110);
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
        } else if (cardsArray[card] == 209){
            iv.setImageResource(img209);
        } else if (cardsArray[card] == 210){
            iv.setImageResource(img210);
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
            clickedFirst = card; // Update to store the tag value of the clicked ImageView

            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card; // Update to store the tag value of the clicked ImageView

            // Disable all ImageViews temporarily
            disableAllImageViews();

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
                        AnimatorSet flipFirstBack = (AnimatorSet) AnimatorInflater.loadAnimator(HardMode.this, R.animator.flip_to_front);
                        AnimatorSet flipSecondBack = (AnimatorSet) AnimatorInflater.loadAnimator(HardMode.this, R.animator.flip_to_back);

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

    private void disableAllImageViews() {
        crd_11.setEnabled(false);
        crd_12.setEnabled(false);
        crd_13.setEnabled(false);
        crd_14.setEnabled(false);
        crd_21.setEnabled(false);
        crd_22.setEnabled(false);
        crd_23.setEnabled(false);
        crd_24.setEnabled(false);
        crd_31.setEnabled(false);
        crd_32.setEnabled(false);
        crd_33.setEnabled(false);
        crd_34.setEnabled(false);
        crd_41.setEnabled(false);
        crd_42.setEnabled(false);
        crd_43.setEnabled(false);
        crd_44.setEnabled(false);
        crd_51.setEnabled(false);
        crd_52.setEnabled(false);
        crd_53.setEnabled(false);
        crd_54.setEnabled(false);

    }


    // Method to get ImageView ID based on clicked card tag
    private int getImageViewId(int clickedCard) {
        switch (clickedCard) {
            case 0:
                return R.id.crd_11;
            case 1:
                return R.id.crd_12;
            case 2:
                return R.id.crd_13;
            case 3:
                return R.id.crd_14;
            case 4:
                return R.id.crd_21;
            case 5:
                return R.id.crd_22;
            case 6:
                return R.id.crd_23;
            case 7:
                return R.id.crd_24;
            case 8:
                return R.id.crd_31;
            case 9:
                return R.id.crd_32;
            case 10:
                return R.id.crd_33;
            case 11:
                return R.id.crd_34;
            case 12:
                return R.id.crd_41;
            case 13:
                return R.id.crd_42;
            case 14:
                return R.id.crd_43;
            case 15:
                return R.id.crd_44;
            case 16:
                return R.id.crd_51;
            case 17:
                return R.id.crd_52;
            case 18:
                return R.id.crd_53;
            case 19:
                return R.id.crd_54;
            default:
                return -1;
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
            crd_11.setImageResource(R.drawable.cardbg);
            crd_12.setImageResource(R.drawable.cardbg);
            crd_13.setImageResource(R.drawable.cardbg);
            crd_14.setImageResource(R.drawable.cardbg);
            crd_21.setImageResource(R.drawable.cardbg);
            crd_22.setImageResource(R.drawable.cardbg);
            crd_23.setImageResource(R.drawable.cardbg);
            crd_24.setImageResource(R.drawable.cardbg);
            crd_31.setImageResource(R.drawable.cardbg);
            crd_32.setImageResource(R.drawable.cardbg);
            crd_33.setImageResource(R.drawable.cardbg);
            crd_34.setImageResource(R.drawable.cardbg);
            crd_41.setImageResource(R.drawable.cardbg);
            crd_42.setImageResource(R.drawable.cardbg);
            crd_43.setImageResource(R.drawable.cardbg);
            crd_44.setImageResource(R.drawable.cardbg);
            crd_51.setImageResource(R.drawable.cardbg);
            crd_52.setImageResource(R.drawable.cardbg);
            crd_53.setImageResource(R.drawable.cardbg);
            crd_54.setImageResource(R.drawable.cardbg);
        }
        EnableAllCards();
    }

    public void EnableAllCards(){
        crd_11.setEnabled(true);
        crd_12.setEnabled(true);
        crd_13.setEnabled(true);
        crd_14.setEnabled(true);
        crd_21.setEnabled(true);
        crd_22.setEnabled(true);
        crd_23.setEnabled(true);
        crd_24.setEnabled(true);
        crd_31.setEnabled(true);
        crd_32.setEnabled(true);
        crd_33.setEnabled(true);
        crd_34.setEnabled(true);
        crd_41.setEnabled(true);
        crd_42.setEnabled(true);
        crd_43.setEnabled(true);
        crd_44.setEnabled(true);
        crd_51.setEnabled(true);
        crd_52.setEnabled(true);
        crd_53.setEnabled(true);
        crd_54.setEnabled(true);
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
                Intent i = new Intent(getApplicationContext(), HardMode.class);
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
        img109 = R.drawable.card9;
        img110 = R.drawable.card10;

        img201 = R.drawable.card1dup;
        img202 = R.drawable.card2dup;
        img203 = R.drawable.card3dup;
        img204 = R.drawable.card4dup;
        img205 = R.drawable.card5dup;
        img206 = R.drawable.card6dup;
        img207 = R.drawable.card7dup;
        img208 = R.drawable.card8dup;
        img209 = R.drawable.card9dup;
        img210 = R.drawable.card10dup;

    }


    // If players manage to match all cards
    private boolean areAllCardsInvisible() {
        // Check if all image views representing cards are invisible
        return  crd_11.getVisibility() == View.INVISIBLE &&
                crd_12.getVisibility() == View.INVISIBLE &&
                crd_13.getVisibility() == View.INVISIBLE &&
                crd_14.getVisibility() == View.INVISIBLE &&
                crd_21.getVisibility() == View.INVISIBLE &&
                crd_22.getVisibility() == View.INVISIBLE &&
                crd_23.getVisibility() == View.INVISIBLE &&
                crd_24.getVisibility() == View.INVISIBLE &&
                crd_31.getVisibility() == View.INVISIBLE &&
                crd_32.getVisibility() == View.INVISIBLE &&
                crd_33.getVisibility() == View.INVISIBLE &&
                crd_34.getVisibility() == View.INVISIBLE &&
                crd_41.getVisibility() == View.INVISIBLE &&
                crd_42.getVisibility() == View.INVISIBLE &&
                crd_43.getVisibility() == View.INVISIBLE &&
                crd_44.getVisibility() == View.INVISIBLE &&
                crd_51.getVisibility() == View.INVISIBLE &&
                crd_52.getVisibility() == View.INVISIBLE &&
                crd_53.getVisibility() == View.INVISIBLE &&
                crd_54.getVisibility() == View.INVISIBLE;


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
                Intent i = new Intent(getApplicationContext(), HardMode.class);
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
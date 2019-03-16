package com.ron.cranajit.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);
        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int diceArr[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

//        rollButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Log.d("dicee","button clicked");
//            }
//        });
        rollButton.setOnClickListener((v) -> {

            Log.d("dicee", "button clicked");
            Random randomNumberGenerator = new Random();
            int numberleft = randomNumberGenerator.nextInt(6);
            Log.d("dicee", "Number is " + numberleft);

            int numberright = randomNumberGenerator.nextInt(6);
            Log.d("dicee", "Number is " + numberright);
            leftDice.setImageResource(diceArr[numberleft]);
            rightDice.setImageResource(diceArr[numberright]);

        });
    }
}

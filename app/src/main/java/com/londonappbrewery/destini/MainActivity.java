package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button topButton;
    Button botButton;
    int index;


    private int [] mStoryBank = new int[] {
            R.string.T1_Story,
            R.string.T2_Story,
            R.string.T3_Story,
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };


    private int [] mTopBank = new int[] {
            R.string.T1_Ans1,
            R.string.T2_Ans1,
            R.string.T3_Ans1,
    };

    private int [] mBotBank = new int[] {
            R.string.T1_Ans2,
            R.string.T2_Ans2,
            R.string.T3_Ans2
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        botButton = findViewById(R.id.buttonBottom);

        story.setText(mStoryBank[index]);
        topButton.setText(mTopBank[0]);
        botButton.setText(mBotBank[0]);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < 2){
                    story.setText(mStoryBank[2]);
                    topButton.setText(mTopBank[2]);
                    botButton.setText(mBotBank[2]);

                    index = 2;

                } else {
                    story.setText(mStoryBank[5]);
                    topButton.setVisibility(View.GONE);
                    botButton.setVisibility(View.GONE);
                }

            }
        });

        botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 0){
                    story.setText(mStoryBank[1]);
                    topButton.setText(mTopBank[1]);
                    botButton.setText(mBotBank[1]);
                    index = 1;
                } else if (index == 1){
                    story.setText(mStoryBank[3]);
                    topButton.setVisibility(View.GONE);
                    botButton.setVisibility(View.GONE);
                } else {
                    story.setText(mStoryBank[4]);
                    topButton.setVisibility(View.GONE);
                    botButton.setVisibility(View.GONE);
                }

            }
        });

//        if(index == 0) {
//            AlertDialog.Builder alert = new AlertDialog.Builder(this);
//            alert.setTitle("Game Over");
//            alert.setCancelable(false);
//            alert.setMessage("Cool story, bro!");
//            alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    finish();
//                }
//            });
//            alert.show();
//
//        }




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:






        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}

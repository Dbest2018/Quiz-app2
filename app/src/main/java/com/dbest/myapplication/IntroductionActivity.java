package com.dbest.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class IntroductionActivity extends AppCompatActivity {
    private int mScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView greetings = findViewById(R.id.greetings);
        greetings.setText("Hello " + username);

    }

    public int onCheckAnswer(View view){
        // option one c, two a , three d, four a, five c, six c, seven a, eight d, nine a, ten b
        int[] answers = {R.id.option_one_c, R.id.option_two_a, R.id.option_three_d, R.id.option_four_a, R.id.option_five_c,
                R.id.option_six_c, R.id.option_seven_a, R.id.option_eight_d, R.id.option_nine_a, R.id.option_ten_b};
        for (int i = 0; i < answers.length; i++){
            if (view.getId() == answers[i]){
                mScore++;
            }
        }
       return mScore;
    }

    public void submit(View view){
        Toast.makeText(this, "Your score is " + mScore, Toast.LENGTH_SHORT).show();
    }
}

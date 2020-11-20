package com.dbest.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button nextButton;
    private EditText mName;
    private EditText mAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = findViewById(R.id.next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAge();
            }
        });

    }

    private void checkAge(){
        mAge = findViewById(R.id.age);
        mName = findViewById(R.id.name);
        String ageString = mAge.getText().toString();
        String username = mName.getText().toString();
        if(Integer.parseInt(ageString) >= 18){
            Intent intent = new Intent(MainActivity.this, IntroductionActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "the minimum age is 18", Toast.LENGTH_SHORT).show();
        }
    }
}

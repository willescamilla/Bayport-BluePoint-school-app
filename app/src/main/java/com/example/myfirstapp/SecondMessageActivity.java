package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text

    }


    public void scienceMessage(View view) {
        Intent intent = new Intent(this, ScienceMessageActivity.class);
        startActivity(intent);
    }

    public void englishMessage(View view) {
        Intent intent = new Intent(this, EnglishMessageActivity.class);
        startActivity(intent);
    }

    public void mathMessage(View view) {
        Intent intent = new Intent(this, MathMessageActivity.class);
        startActivity(intent);
    }

    public void musicMessage(View view) {
        Intent intent = new Intent(this, SecondMessageActivity.class);
        startActivity(intent);
    }

    public void socialMessage(View view) {
        Intent intent = new Intent(this, SocialMessageActivity.class);
        startActivity(intent);
    }

    public void langMessage(View view) {
        Intent intent = new Intent(this, LangMessageActivity.class);
        startActivity(intent);
    }
}

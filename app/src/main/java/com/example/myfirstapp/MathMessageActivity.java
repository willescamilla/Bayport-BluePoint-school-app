package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MathMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_message);
    }

    public void startDeyo(View View) {
        Uri webpage = Uri.parse("https://tinyurl.com/bbpdeyo");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startSchwimmer(View View) {
        Uri webpage = Uri.parse("https://www2.eboard.com/eboard/servlet/BoardServlet?ACTION=BOARD_SHOW&SITE_NAME=Destination&BOARD_NAME=schwimmer&SESSION_ID=cfxmi8p0l65j8698");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startZafonte(View View) {
        Uri webpage = Uri.parse("http://zafonte.com/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startPlugues(View View) {
        Uri webpage = Uri.parse("http://tinyurl.com/mrplugues");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startMulgrave(View View) {
        Uri webpage = Uri.parse("https://www2.eboard.com/eboard/servlet/BoardServlet?ACTION=BOARD_SHOW&SITE_NAME=Destination&BOARD_NAME=Mulgrave&SESSION_ID=aq705g2ou7kidkf5078");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startHaas(View View) {
        Uri webpage = Uri.parse("http://tinyurl.com/haascalc");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}

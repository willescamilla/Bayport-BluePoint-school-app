package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=(WebView) findViewById(R.id.webviewId);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://twitter.com/bbpschools?lang=en");

    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    public void secondMessage(View view) {
        Intent intent = new Intent(this, SecondMessageActivity.class);
        startActivity(intent);
    }

    public void startPortal(View View){
        Uri webpage = Uri.parse("https://parentportal.eschooldata.com/Login.aspx?ReturnUrl=%2f");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
    public void startCalendar(View View){
        Uri webpage = Uri.parse("http://bbpschools.org/mobile/calendar/default.aspx");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }


}

package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LangMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_message);
    }

    public void startScharf(View View) {
        Uri webpage = Uri.parse("http://ktscharf.wixsite.com/clase");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startVieira(View View) {
        Uri webpage = Uri.parse("http://vieirabbp.wixsite.com/espanol");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }

    public void startAllen(View View) {
        Uri webpage = Uri.parse("https://sites.google.com/a/g.bbpschools.org/madameaallen/");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(webIntent);
    }
}

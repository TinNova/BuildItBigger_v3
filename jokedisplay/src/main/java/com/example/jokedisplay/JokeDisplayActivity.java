package com.example.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeTV = (TextView) findViewById(R.id.tvJoke);

        Intent i = getIntent();
        String joke = i.getStringExtra("joke");

        jokeTV.setText(joke);

    }
}

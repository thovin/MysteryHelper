package com.example.mysteryhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private String[] options;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        options = getResources().getStringArray(R.array.textview);

        findViewById(R.id.helpButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                displayRandOption();
            }
        });
    }

    private void displayRandOption() {
        TextView optionDisplay = findViewById(R.id.contentText);

        int optionIndex = ThreadLocalRandom.current().nextInt(0, options.length);

        optionDisplay.setText(options[optionIndex]);
    }
}
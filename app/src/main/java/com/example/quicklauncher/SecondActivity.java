package com.example.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // process any parameters sent
        if (getIntent().hasExtra("com.example.quicklauncher.FIRSTNAME")){
            TextView secondActivityScreenTextView = (TextView) findViewById(R.id.secondActivityScreenTextView);
            String text = getIntent().getExtras().getString("com.example.quicklauncher.FIRSTNAME");
            secondActivityScreenTextView.setText(text);
        }

    }
}

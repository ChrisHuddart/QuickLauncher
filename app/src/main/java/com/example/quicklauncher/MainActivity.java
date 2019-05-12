package com.example.quicklauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set references to screen variables (objects - text buttons etc, things on the screen)
        // - then associate an activity to that button being clicked

        // establish a reference to the on-screen secondActivityButton button
        Button secondActivityButton = (Button) findViewById(R.id.secondActivityButton);
        // set an 'on click' listener activity
        secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent (getApplicationContext(), SecondActivity.class);

                //Add parameters to be passed to the SecondActivity class that is called when the
                //secondActivityButton on the MainActivity screen (MainActivity.View ??)
                startIntent.putExtra("com.example.quicklauncher.FIRSTNAME", "First value");
                startActivity(startIntent);
            }
        });

        // Button secondActivityButton = (Button) findViewById(R.id.googleSearchButton);


    }
}

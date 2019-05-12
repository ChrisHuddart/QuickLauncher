package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        // establish a reference to the on-screen secondActivityButton button
        // & set an 'on click' listener activity
        Button googleSearchButton = (Button) findViewById(R.id.googleSearchButton);
        googleSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // define variables

                // setup URL to be sent to the browser (or parameters for any other external app)
                // String tempGoogleURL = "https://google.com";
                // a URI (Universal Resource Identifier) is used to send parameters to external app??
                // x = String "https://google.com";
                Uri googleURI = Uri.parse((String) "https://google.com");

                // now setup the intent - the action that the user intends to do, in this case
                // launch a browser and open it at google.com
                Intent launchGoogle = new Intent(Intent.ACTION_VIEW, googleURI);
                // check that there is a package
                if (launchGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(launchGoogle);
                }
            }
        });
    }
}

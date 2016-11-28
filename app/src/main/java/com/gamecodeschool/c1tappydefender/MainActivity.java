package com.gamecodeschool.c1tappydefender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get a reference of our button in the layout
        final Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
        // listen for clicks
        buttonPlay.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        // must be a play button
        // create a new intent object
        Intent i = new Intent
    }
}

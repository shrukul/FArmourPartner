package com.example.shrukul.farmourseller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // refer this link - https://www.bignerdranch.com/blog/splash-screens-the-right-way/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
            }
        }, SPLASH_TIME_OUT);
    }

}
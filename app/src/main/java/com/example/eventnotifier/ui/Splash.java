package com.example.eventnotifier.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.eventnotifier.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //using a thread and halt screen for 2 seconds
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences("User", MODE_PRIVATE);
                String sharedUsername = sharedPreferences.getString("username", "");
                String sharedPassword = sharedPreferences.getString("password", "");

//                    if(sharedUsername.equals("admin") && sharedPassword.equals("password")){
//                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                        startActivity(intent);
//                        finish(); //close the activity
//                    }
//                    else {
                Intent intent = new Intent(Splash.this, Loginpage.class);
                startActivity(intent);
//                    }

            }
        }, 2000);
    }
}
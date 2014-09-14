package com.example.splashscreenapp;
 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
 
public class SplashScreen extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
         
         /****** Create Thread that will sleep for 2 seconds *************/        
        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Intent i=new Intent(getBaseContext(), SimpleListView.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }
            }
        };
        background.start();
    }
     
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
package com.example.manoj_pc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by MANOJ-PC on 3/9/2018.
 */

public class SecondActivity extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },10000);

    }
}

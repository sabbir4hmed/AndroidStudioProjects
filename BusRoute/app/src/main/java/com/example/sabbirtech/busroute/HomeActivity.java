package com.example.sabbirtech.busroute;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button Bus_list_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep;
                    Intent intent = new Intent(HomeActivity.this, AkikActivity.class);
                    HomeActivity.this.startActivity(intent);
                    HomeActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


    }


}

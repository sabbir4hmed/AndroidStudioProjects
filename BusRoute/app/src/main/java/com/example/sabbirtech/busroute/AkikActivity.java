package com.example.sabbirtech.busroute;

//import android.annotation.SuppressLint;
import android.support.annotation.Nullable;
//import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.os.Handler;
//import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.InputStream;

public class AkikActivity extends AppCompatActivity{
    private Button show_btn;
    private EditText textview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akik);

        show_btn = (Button) findViewById(R.id.show_btn);


        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   InputStream inps = openFileInput("")
               }
               catch (Exception e)
               {
            }
        });




    }
}
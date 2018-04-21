package com.example.sabbirtech.busroute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusListActivity extends AppCompatActivity {

    private Button Akik_btn;
   // private Button nure_btn;
    //private Button bahon_btn;
    //private Button first_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);

        Akik_btn = (Button) findViewById(R.id.Akik_btn);

        Akik_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusListActivity.this,AkikActivity.class);
                startActivity(intent);
            }
        });










    }
}

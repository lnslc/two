package com.example.songlicai.two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    // TODO: 2016/11/21 xxx
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Document doc = new Document();
        Gson g = new Gson();
    }
}

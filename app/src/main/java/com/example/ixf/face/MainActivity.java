package com.example.ixf.face;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    Button loginBtn = null;
    EditText useridEt = null;
    EditText passEt = null;
    TextView promptText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getActionBar();
         actionBar.setDisplayShowTitleEnabled(false);

        actionBar.setDisplayShowHomeEnabled(false);

        loginBtn = (Button) findViewById(R.id.loginBtn);

        useridEt = (EditText) findViewById(R.id.userId);
        passEt = (EditText) findViewById(R.id.pass);
        promptText = (TextView) findViewById(R.id.promptText);




    }
}

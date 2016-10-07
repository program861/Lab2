package com.example.mycomp.lab2;


import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.mycomp.lab2.ListItemsActivity;
import com.example.mycomp.lab2.R;

import java.util.ArrayList;

public class ChatWindow extends AppCompatActivity {

    private final String ACTIVITY_NAME = ListItemsActivity.class.getSimpleName();
    ListView listView;
    EditText editText;
    Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);


        ListView listView = (ListView) findViewById(R.id.listView);
        EditText editText = (EditText) findViewById(R.id.EditText4);
        Button send = (Button) findViewById(R.id.button4);

        ArrayList<String> data = new ArrayList<String>();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_NAME, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_NAME, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(ACTIVITY_NAME, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_NAME, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_NAME, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(ACTIVITY_NAME, "onRestart");
    }
}



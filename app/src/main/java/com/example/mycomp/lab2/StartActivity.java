package com.example.mycomp.lab2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    protected static final String Activity_Name = "StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.i(Activity_Name, "In onCreate()");
        setContentView(R.layout.activity_start);
        // Lab 3:  #6 Store a reference to the Button by calling findViewById()
        Button onlyButton = (Button) findViewById(R.id.button);
        // Lab 3 : # 6 Write the clickHandler
        onlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, ListItemsActivity.class);
                startActivityForResult(intent, 5);
            }
        });

        Button chatButton = (Button) findViewById(R.id.chatButton);
        chatButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(StartActivity.this, ChatWindow.class);
             startActivityForResult(intent, 2);



         }
        });
    }


    // Lab 3-6 Write the function: onActivityResult...
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 5) {
            Log.i(Activity_Name, "Returned to StartActivity.onActivityResult");
            // Lab3 # 11:
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, getString(R.string.take_message) + data.getStringExtra("Response"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }




    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Activity_Name, "In onResume()");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Activity_Name, "In onStart()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Activity_Name, "In onPause()");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Activity_Name, "In onStop()");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Activity_Name, "In onDestroy()");

    }


}

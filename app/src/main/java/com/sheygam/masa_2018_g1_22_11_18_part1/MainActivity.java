package com.sheygam.masa_2018_g1_22_11_18_part1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MY_TAG","MainActivity onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextBtn = findViewById(R.id.next_activity_btn);
        nextBtn.setOnClickListener(this);
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: MainActivity");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: MainActivity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: MainActivity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: MainActivity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: MainActivity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: MainActivity");
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.next_activity_btn){
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("NAME","Vasya");
            intent.putExtra("AGE",23);
//            startActivity(intent);
            startActivityForResult(intent,1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK && requestCode == 1){
            String name = data.getStringExtra("NAME");
            Log.d(TAG, "onActivityResult: " + name);
        }else{
            Log.d(TAG, "onActivityResult: result code = CANCELED!" );
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}

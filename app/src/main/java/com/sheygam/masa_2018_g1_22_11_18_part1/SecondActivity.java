package com.sheygam.masa_2018_g1_22_11_18_part1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MY_TAG";
    private EditText input;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onCreate: SecondActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button nextActivityBtn = findViewById(R.id.next_activity_btn);
        input = findViewById(R.id.my_input);

        nextActivityBtn.setOnClickListener(this);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        int age = intent.getIntExtra("AGE",0);
        Toast.makeText(this, "name: " + name + " age: " + age, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart: SecondActivity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "onResume: SecondActivity");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "onPause: SecondActivity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop: SecondActivity");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy: SecondActivity");
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.next_activity_btn){
//            Intent intent = new Intent(this,SecondActivity.class);
//            startActivity(intent);

            String userInput = String.valueOf(input.getText());

            Intent intent = new Intent();
            intent.putExtra("NAME",userInput);

            setResult(RESULT_OK,intent);

            finish();
        }
    }
}

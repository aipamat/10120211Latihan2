package com.example.a10120211latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThereActivity extends AppCompatActivity {
    //    29 April 2023
    //    10120211 - Arif Rachmat Darmawan - IF6
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);

        Button button = (Button) findViewById(R.id.btn_verify);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VerifyYourAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
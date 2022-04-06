package com.example.a18520911_lab2_ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceAsColor")
    public void onRadioClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        if (checked){
            View someView = findViewById(R.id.frameLayout);
            switch (view.getId()){
                case R.id.red:
                    someView.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
                    break;
                case R.id.green:
                    someView.setBackgroundColor(ContextCompat.getColor(this,R.color.green));
                    break;
                case R.id.blue:
                    someView.setBackgroundColor(ContextCompat.getColor(this,R.color.blue));
                    break;
                case R.id.gray:
                    someView.setBackgroundColor(ContextCompat.getColor(this,R.color.darkGrey));
                    break;
            }
        }
    }
}
package com.ashik.ifosmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ashik.ifosmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Step 1
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Step 2
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // Step 3
        activityMainBinding.showName.setText("HUUUUU");
    }
}
package com.ashik.ifosmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.ashik.ifosmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Step 1
    private ActivityMainBinding activityMainBinding;

    private MainActivityViewModel ViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Step 2
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // Step 3
        activityMainBinding.showName.setText("HUUUUU");

        //for viewmodel access, to pass value use factory
        ViewModel = new ViewModelProvider(this, new MainActivityViewModelFactory(5)).get(MainActivityViewModel.class);

        activityMainBinding.startStopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                activityMainBinding.countNo.setText(ViewModel.getCurrentCount().toString());
                ViewModel.updateCurrentCount();

                if (activityMainBinding.progressBar.getVisibility()==View.VISIBLE)
                {
                    activityMainBinding.progressBar.setVisibility(View.INVISIBLE);
                    activityMainBinding.startStopBtn.setText("START");
                }else {
                    activityMainBinding.progressBar.setVisibility(View.VISIBLE);
                    activityMainBinding.startStopBtn.setText("STOP");
                }


            }
        });

        // Here it is getting data as an object and passing it to view xml > xml is parsing the data accordingly
        // in real life scenarios getStudent method type will be user to get API call objects.
        activityMainBinding.setStudent(getStudent());


    }


    private Student getStudent()
    {
        Student student = new Student("10", "Ashik");
        return student;
    }


}
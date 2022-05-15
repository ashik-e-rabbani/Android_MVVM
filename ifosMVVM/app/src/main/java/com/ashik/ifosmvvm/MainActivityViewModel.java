package com.ashik.ifosmvvm;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    Integer count = 0;

    public Integer getCurrentCount(){
        return count;
    }

    public Integer updateCurrentCount(){
        return ++count;
    }
}

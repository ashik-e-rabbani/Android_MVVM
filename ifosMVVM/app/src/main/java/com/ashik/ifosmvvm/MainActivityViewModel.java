package com.ashik.ifosmvvm;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    Integer count;

    public MainActivityViewModel(Integer count) {
        this.count = count;
    }

    public Integer getCurrentCount(){
        return count;
    }

    public Integer updateCurrentCount(){
        return ++count;
    }
}

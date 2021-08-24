package com.example.tabfragment.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelPager extends ViewModel {
    private MutableLiveData <String> mutableLiveData=new MutableLiveData<>();
    public void setName(String name){
        mutableLiveData.setValue(name);
    }
    public LiveData <String> getName(){
        return mutableLiveData;
    }
}

package com.dipen.plannerapp.ui.Daily;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DailyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DailyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Daily fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
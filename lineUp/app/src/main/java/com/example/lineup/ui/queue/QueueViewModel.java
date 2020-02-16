package com.example.lineup.ui.queue;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class QueueViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QueueViewModel() {
        mText = new MutableLiveData<>();
         mText.setValue("This is Queue fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

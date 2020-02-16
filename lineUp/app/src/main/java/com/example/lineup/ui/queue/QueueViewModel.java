package com.example.lineup.ui.queue;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.lineup.R;

public class QueueViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QueueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is queue fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

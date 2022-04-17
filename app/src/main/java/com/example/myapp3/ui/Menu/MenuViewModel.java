package com.example.myapp3.ui.Menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hello User, \nThis is the Menu for today");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
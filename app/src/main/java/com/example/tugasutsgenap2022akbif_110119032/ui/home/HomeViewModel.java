package com.example.tugasutsgenap2022akbif_110119032.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mTextNim;

    public HomeViewModel() {
        mTextNim = new MutableLiveData<>();

        mTextNim.setValue("NIM : 10119032");
    }

    public LiveData<String> getText() {
        return mTextNim;
    }
}
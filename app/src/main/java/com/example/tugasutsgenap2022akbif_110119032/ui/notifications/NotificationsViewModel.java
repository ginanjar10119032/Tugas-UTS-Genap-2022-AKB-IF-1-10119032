package com.example.tugasutsgenap2022akbif_110119032.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        String nim = ("NIM : 10119032\n\n");
        String nama = ("Nama : Ginanjar Tubagus Gumilar\n\n");
        String kelas = ("Kelas : IF-1");

        mText = new MutableLiveData<>();
        mText.setValue(nim+nama+kelas);

    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.example.tugasutsgenap2022akbif_110119032.ui.dashboard;

//NIM     : 10119032
//NAMA    : GINANJAR TUBAGUS GUMILAR
//KELAS   : IF-1

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
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
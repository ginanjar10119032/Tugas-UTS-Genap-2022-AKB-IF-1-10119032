package com.example.tugasutsgenap2022akbif_110119032.ui.home;

//NIM     : 10119032
//NAMA    : GINANJAR TUBAGUS GUMILAR
//KELAS   : IF-1


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        String nim = ("NIM : 10119032\n\n");
        String nama = ("Nama : Ginanjar Tubagus Gumilar\n\n");
        String kelas = ("Kelas : IF-1\n\n");
        String email = ("Email : ginanjar0822@gmail.com");

        mText = new MutableLiveData<>();
        mText.setValue(nim+nama+kelas+email);

    }

    public LiveData<String> getText() {
        return mText;
    }
}
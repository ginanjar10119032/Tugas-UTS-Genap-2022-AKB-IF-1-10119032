package com.example.tugasutsgenap2022akbif_110119032.ui.notifications;

//NIM     : 10119032
//NAMA    : GINANJAR TUBAGUS GUMILAR
//KELAS   : IF-1

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        String nama = ("Aplikasi Catatan Harian\n");
        String versi = ("Versi 1.0\n");
        String made = ("Dibuat oleh Ginanjar T.G.\n\n\n\n");
        String motto = ("Ayo, tuliskan keluh kesahmu dalam menjalani kehidupan kedalam aplikasi ini !");

        mText = new MutableLiveData<>();
        mText.setValue(nama+versi+made+motto);

    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.selsapps.selsbooklistings;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;

public class BookViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Book>> books;
    public LiveData<ArrayList<Book>> getBooks() {
        if (books == null) {
            books = new MutableLiveData<ArrayList<Book>>();
            loadBooks();
        }
        return books;
    }

    private void loadBooks() {
        // TODO: implement this method
    }

}

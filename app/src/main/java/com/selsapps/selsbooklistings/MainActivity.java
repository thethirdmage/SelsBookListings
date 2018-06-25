package com.selsapps.selsbooklistings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public String queryUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchBooks (View view) {
        EditText bookSearch = findViewById(R.id.bookSearch);
        StringBuilder searchBuilder = new StringBuilder();
        String prependString = "https://www.googleapis.com/books/v1/volumes?q=";
        String appendString = "&maxResults=10";

        // Build the string
        searchBuilder.append(prependString);
        searchBuilder.append(bookSearch.getText().toString());
        searchBuilder.append(appendString);

        queryUrl = searchBuilder.toString();
    }
}

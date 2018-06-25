package com.selsapps.selsbooklistings;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Custom constructor for the book adapter
     * @param context current application context
     * @param books   a list of books from the search
     */
    public BookAdapter (Activity context, ArrayList<Book> books) {
        super(context, 0, books);
    }


    /**
     * Takes the information for a given book and populates its list item view with the info
     * @param position    the position of the book in the data
     * @param convertView the old view to reuse, if possible
     * @param parent      the ListView of the main app
     * @return            a fully populated list item view
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // If there's no item, create one
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        // Get the book info at the position
        Book currentBook = getItem(position);

        // Set up the views
        TextView titleView = listItemView.findViewById(R.id.titleView);
        TextView authorView = listItemView.findViewById(R.id.authorView);
        ImageView coverArtView = listItemView.findViewById(R.id.bookPic);

        // Populate the views
        titleView.setText(currentBook.getBookTitle());
        authorView.setText(currentBook.getBookAuthor());
        Picasso.get().load(currentBook.getBookCoverArt()).into(coverArtView);

        // Finally, return the book view
        return listItemView;

    }
}

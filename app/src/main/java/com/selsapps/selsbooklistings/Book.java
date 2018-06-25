package com.selsapps.selsbooklistings;

public class Book {

    private String mTitle;
    private String mAuthor;
    private String mCoverArt;

    public Book (String title, String author, String coverArt) {
        mTitle = title;
        mAuthor = author;
        mCoverArt = coverArt;
    }

    public String getBookAuthor() {
        return mAuthor;
    }

    public String getBookTitle() {
        return mTitle;
    }

    public String getBookCoverArt() {
        return mCoverArt;
    }

}

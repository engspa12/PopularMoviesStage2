package com.example.dbm.popularmoviesstage2.classes;

public class Review {

    private String mAuthor;
    private String mContent;

    public Review(String author,String content){
        mAuthor = author;
        mContent = content;
    }

    public String getReviewAuthor(){
     return mAuthor;
    }

    public String getReviewContent(){
        return mContent;
    }

}

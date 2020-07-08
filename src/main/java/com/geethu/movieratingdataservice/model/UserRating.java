package com.geethu.movieratingdataservice.model;

import java.util.List;

public class UserRating{


    private List<MovieRating> userRatings;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public UserRating() {
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public UserRating(List<MovieRating> userRatings) {
        this.userRatings = userRatings;
    }

    public List<MovieRating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<MovieRating> userRatings) {
        this.userRatings = userRatings;
    }


}


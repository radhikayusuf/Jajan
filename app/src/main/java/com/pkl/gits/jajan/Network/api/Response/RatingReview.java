package com.pkl.gits.jajan.Network.api.Response;

/**
 * Created by Varokah on 10/17/2016.
 */
public class RatingReview {
    private String rating,review,id_user;

    public RatingReview(String rating, String review, String id_user) {
        this.rating = rating;
        this.review = review;
        this.id_user = id_user;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
}

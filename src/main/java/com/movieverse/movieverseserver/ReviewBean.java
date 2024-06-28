package com.movieverse.movieverseserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewBean {
   private int id;
   private int movie_id;
   private String Reviewer;
   private String comment;
   private double rating;   

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", movie_id='" + getMovie_id() + "'" +
            ", Reviewer='" + getReviewer() + "'" +
            ", comment='" + getComment() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovie_id() {
        return this.movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getReviewer() {
        return this.Reviewer;
    }

    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

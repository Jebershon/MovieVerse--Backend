package com.movieverse.movieverseserver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieBean {
    private int movie_id;
    private String title;
    private String director;
    private String genre;
    private int year;
    private String image;
    private double rating;

    @Override
    public String toString() {
        return "{" +
            " movie_id='" + getMovie_id() + "'" +
            ", title='" + getTitle() + "'" +
            ", director='" + getDirector() + "'" +
            ", genre='" + getGenre() + "'" +
            ", year='" + getYear() + "'" +
            ", image='" + getImage() + "'" +
            ", rating='" + getRating() + "'" +
            "}";
    }

    public int getMovie_id() {
        return this.movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

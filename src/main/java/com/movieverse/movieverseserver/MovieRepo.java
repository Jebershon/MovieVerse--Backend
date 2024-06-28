package com.movieverse.movieverseserver;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import com.movieverse.ReviewBean;
@Repository
public class MovieRepo {
    private final JdbcClient jdbcClient;
    MovieRepo(JdbcTemplate template, JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
    public List<MovieBean> getall() {
        return jdbcClient
        .sql("Select * from movie")
        .query(
            (req,res)->{
            return new MovieBean(req.getInt("movie_id"), req.getString("title"), req.getString("genre"), req.getString("director"), req.getInt("release_year"), req.getString("image_url"), req.getDouble("rating")); 
        }).list();
    }
    public List<ReviewBean> getallReview(){
        return jdbcClient
        .sql("Select * from review where ")
        .query(
            (req,res)->{
                return new ReviewBean(req.getInt("id"), req.getInt("movie_id"), req.getString("comment"), req.getString("reviewer"), req.getInt("rating"));
                }).list();
    }
    public void AddMovie(MovieBean a){
        jdbcClient
        .sql("insert into movie (title,director,genre,release_year,image_url,rating) values (?,?,?,?,?,?)")
        .params(a.getTitle(), a.getDirector(), a.getGenre(), a.getYear(), a.getImage() , a.getRating())
        .update();
    }
    // query - > only helps to read statement execution
    // update -> only helps to modify the table statement
    // .params(Map.of("id", id, "xyz", id))
    public void deleteMovieById(int id) {
        jdbcClient.sql("delete from movie where movie_id = :id")
                .params(Map.of("id", id))
                .update();  
    }
    public void updateMovie(MovieBean movie, int id) {
            jdbcClient.sql("UPDATE movie SET title = ?, director = ?, genre = ?, release_year = ?, image_url = ?, rating = ? WHERE movie_id = ?")
                      .params(movie.getTitle(), movie.getDirector(), movie.getGenre(), movie.getYear(), movie.getImage(), movie.getRating(), id)
                      .update();
    }
}

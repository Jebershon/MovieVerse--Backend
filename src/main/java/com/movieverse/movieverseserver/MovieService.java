package com.movieverse.movieverseserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private final MovieRepo mr;
    public MovieService(MovieRepo mr){
      this.mr = mr;
    }
    public List<MovieBean> getAllMovie() {
        return mr.getall();
    }
    public void AddMovie(MovieBean mb){
        mr.AddMovie(mb);
    }
    public void deleteMovieById(int id) {
        mr.deleteMovieById(id);
    }
    public void updateMovie(MovieBean mb,int id) {
        mr.updateMovie(mb, id);
    }
}

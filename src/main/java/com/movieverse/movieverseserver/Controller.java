package com.movieverse.movieverseserver;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/")

public class Controller {
@Autowired
 MovieService ms;
 @GetMapping("/getall")
 public List<MovieBean> getMethodName() {
     return ms.getAllMovie();
 }
 @PostMapping("/AddMovie")
 public String AddMovie(@RequestBody MovieBean mb){
    ms.AddMovie(mb);
    return "Successfully Added";
 }
 @DeleteMapping("/Delete")
 public String deleteMovieById(@RequestParam int id){
    ms.deleteMovieById(id);
    return "Deleted Successfully";
 }
 @PostMapping("/Update")
 public String updateMovie(@RequestBody MovieBean mb,@RequestParam int id){
   ms.updateMovie(mb,id);
   return "Updated Successfully";
 }
}

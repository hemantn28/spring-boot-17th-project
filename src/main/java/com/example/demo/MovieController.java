package com.example.demo;

import com.example.demo.model.Movie;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    ArrayList<Movie> movieArrayList=new ArrayList<>();

    //1. Create => Add

    @RequestMapping("/add_movie")
    public String add(@RequestBody Movie movie){
       // Movie movie=new Movie("Sholay",1975,"Drama");

        movieArrayList.add(movie);
        return "movie added successfully";
    }

    //2.Read =>Get

    @RequestMapping("/get_movielist")
    public ArrayList<Movie> getMovieArrayList() {
        return movieArrayList;
    }

    //3. Update

    @RequestMapping("/update_movie")
    public String update(){
        movieArrayList.get(0).setName("Zanjeer");
        return "movie updated successfully";

    }

    //4.Delete

    @RequestMapping("/delete_movie")
    public String delete(){
        movieArrayList.remove(0);
        return "movie deleted successfully";
    }
}

package com.geethu.movieratingdataservice.resource;

import com.geethu.movieratingdataservice.model.MovieRating;
import com.geethu.movieratingdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {

    @RequestMapping("/{movieId}")
    public List<MovieRating> getRatings(@PathVariable String movieId){
        return Collections.singletonList(new MovieRating("123", 3, "This was good"));
    }
    @RequestMapping("/users/{movieId}")
    public UserRating getUserRatings(@PathVariable String movieId){
        //Avoid sending an array list as a response, use object for flexibility of adding more nodes
        return new UserRating(Arrays.asList(new MovieRating("550",3,"This is a great movie"),
                new MovieRating("551",4,"This was bad")));
    }
}

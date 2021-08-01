package co.movie.movies;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
    Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    MovieService movieService;

    @GetMapping(value = "/movies")                              /*working*/
    public List<Movie> getAllMovies(){
        return movieService.findAll();
    }
    @GetMapping(value = "/movies/{id}")                         /*working*/
    public Optional<Movie> getMovie(@PathVariable String id){
        return movieService.findById(id);
    }
    @PostMapping(value = "/movies")                             /*working*/
    public void insertMovie(@RequestBody Movie movie){
        movieService.insertMovie(movie);
    }
    @PutMapping(value = "/movies")
    public void updateMovie(@RequestBody Movie movie){
        movieService.updateMovie(movie);
    }
    @DeleteMapping(value = "/movies/{id}")
    public void deleteMovie(@PathVariable String id){
        movieService.deleteMovie(id);
    }
    @DeleteMapping(value = "/movies/name")
    public void deleteByName(@RequestParam(name = "name") String name){
        movieService.deleteByName(name);
    }
}

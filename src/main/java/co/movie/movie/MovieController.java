package co.movie.movie;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
    Logger logger = LoggerFactory.getLogger(MovieController.class);

    MovieService movieService;

    @GetMapping(value = "/movies")
    public List<Movie> getAllMovies(){
        return movieService.findAll();
    }
    @GetMapping(value = "/movies/{id}")
    public Movie getMovie(){
        return movieService.findById();
    }
}

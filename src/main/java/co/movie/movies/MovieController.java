package co.movie.movies;

import java.util.List;
import java.util.Optional;

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

    @Autowired
    MovieService movieService;

    @Autowired
    private MovieRepositoryES movieRepositoryES;

    @PostMapping(value = "/moviesES")                           /*ElasticSearch working*/
    public void postMovie(@RequestBody List<MovieES> movieES){
        movieRepositoryES.saveAll(movieES);
    }
    @GetMapping(value = "/moviesES")                           /*ElasticSearch working*/
    public Iterable<MovieES> getAllMovieES(){
        return movieRepositoryES.findAll();
    }

    @GetMapping(value = "/moviesES/{name}")                     /*ElasticSearch working*/
    public Iterable<MovieES> getByNameMovieES(@PathVariable String name){
        return movieRepositoryES.findByName(name);
    }

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
    @PutMapping(value = "/movies")                              /*working*/
    public void updateMovie(@RequestBody Movie movie){
        movieService.updateMovie(movie);
    }
    @DeleteMapping(value = "/movies/{id}")                      /*working*/
    public void deleteMovie(@PathVariable String id){
        movieService.deleteMovie(id);
    }
    @DeleteMapping(value = "/movies/name")                      /*working*/
    public void deleteByName(@RequestParam String name){
        movieService.deleteByName(name);
    }
    @GetMapping(value = "/movies/regex/{regex}")                /*working*/
    public List<Movie> getByFirstName(@PathVariable String regex){
        return movieService.findByFirstName(regex);
    }
}

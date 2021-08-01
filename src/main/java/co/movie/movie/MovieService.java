package co.movie.movie;

import java.util.List;
import java.util.Optional;


public class MovieService {

    MovieRepository movieRepository;
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(String id) {
        return movieRepository.findById(id);
    }

    public void insertMovie(Movie movie) {
        movieRepository.insert(movie);
    }

    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }
    
}

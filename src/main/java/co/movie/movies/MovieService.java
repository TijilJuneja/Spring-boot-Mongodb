package co.movie.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
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

    public void deleteByName(String name) {
        movieRepository.deleteByName(name);
    }

    public List<Movie> findByFirstName(String s) {
        return movieRepository.abc(s);
    }
    
}

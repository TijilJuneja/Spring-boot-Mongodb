package co.movie.movies;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MovieRepository extends MongoRepository<Movie,String>{
    public void deleteByName(String name);

    @Query(value = "{'name' : {$regex : ?0}}")
    public List<Movie> abc();
}

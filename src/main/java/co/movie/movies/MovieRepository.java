package co.movie.movies;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MovieRepository extends MongoRepository<Movie,String>{
    public void deleteByName(String name);  /*Queries By Method Name*/

    @Query(value = "{'name' : {$regex : ?0}}")  /*Queries based on JSon*/
    public List<Movie> abc(String s);           /* Functon name id independent of the query */
}

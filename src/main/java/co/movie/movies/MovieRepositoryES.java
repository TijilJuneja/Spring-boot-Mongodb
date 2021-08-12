package co.movie.movies;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MovieRepositoryES extends ElasticsearchRepository<MovieES,String>{

    Iterable<MovieES> findByName(String name);
    
}

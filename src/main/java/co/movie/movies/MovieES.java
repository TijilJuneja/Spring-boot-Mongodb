package co.movie.movies;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="tijil",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieES {
    @Id
    private String id;
    private String name;
    private Actors actor;
    private String director;
    private String producer;

    public MovieES(String id, String name, Actors actor, String director, String producer) {
        this.id = id;
        this.name = name;
        this.actor = actor;
        this.director = director;
        this.producer = producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actors getActor() {
        return actor;
    }

    public void setActor(Actors actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    
}

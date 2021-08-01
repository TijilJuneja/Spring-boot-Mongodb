package co.movie.movies;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Movie")
public class Movie {
    @Id
    private String id;
    private String name;
    private Actors actor;
    private String director;
    private String producer;
    private float IMDB;
    public Movie(String id, String name, Actors actor, String director, String producer) {
        this.id = id;
        this.name = name;
        this.actor = actor;
        this.director = director;
        this.producer = producer;
    }
    public Movie() {
    }
    public float getIMDB() {
        return IMDB;
    }
    public void setIMDB(float iMDB) {
        IMDB = iMDB;
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

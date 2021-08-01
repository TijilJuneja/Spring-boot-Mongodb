package co.movie.movie;

public class Actors {
    private String name;
    private float rating;
    public Actors() {
    }
    public Actors(String name, float rating) {
        this.name = name;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
}

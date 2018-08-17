package models;

public class Actor extends FilmArtist {

    private int id;

    public Actor(String name, Double cashBalance) {
        super(name, cashBalance);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

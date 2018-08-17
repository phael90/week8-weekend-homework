package models;

public class Musician extends FilmArtist {

    private int id;

    public Musician(String name, Double cashBalance){

        super(name, cashBalance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

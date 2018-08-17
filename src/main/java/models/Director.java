package models;

public class Director extends FilmArtist {

    private int id;

    public Director(String name, Double cashBalance){
        super(name, cashBalance);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

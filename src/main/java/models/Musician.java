package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "musicians")
public class Musician extends FilmArtist {

    private int id;

    public Musician(String name, Double cashBalance){
        super(name, cashBalance);
    }

    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

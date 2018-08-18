package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor extends FilmArtist {
    private int id;

    public Actor(){}

    public Actor(String name, Double cashBalance) {
        super(name, cashBalance);

    }

}

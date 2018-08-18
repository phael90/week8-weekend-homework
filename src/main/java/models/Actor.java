package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor extends FilmArtist {

    public Actor(String name, Double cashBalance) {
        super(name, cashBalance);
    }

    public Actor(){}

}

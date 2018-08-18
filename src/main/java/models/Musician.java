package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "musicians")
public class Musician extends FilmArtist {
    private int id;

    public Musician(){}

    public Musician(String name, Double cashBalance){
        super(name, cashBalance);
    }

}

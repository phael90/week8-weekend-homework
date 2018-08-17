package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Actor extends FilmArtist {

    private int id;

    public Actor(String name, Double cashBalance) {
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

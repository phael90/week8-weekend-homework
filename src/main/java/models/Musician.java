package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "musicians")
public class Musician extends FilmArtist {
    private List<Film> films;

    public Musician(String name, Double cashBalance){
        super(name, cashBalance);
        this.films = new ArrayList<Film>();
    }

    public Musician(){}

    @OneToMany(mappedBy = "musician", fetch = FetchType.LAZY)
    public List<Film> getFilms(){
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }


}

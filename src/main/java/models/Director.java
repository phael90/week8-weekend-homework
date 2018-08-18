package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "directors")
public class Director extends FilmArtist {
    private List<Film> films;

    public Director(String name, Double cashBalance) {
        super(name, cashBalance);
        this.films = new ArrayList<Film>();
    }

    public Director(){}

    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}

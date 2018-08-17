package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films_artists")
public abstract class FilmArtist {

    private String name;
    private Double cashBalance;
    private List<Film> films;
    private List<Award> awards;

    public FilmArtist(String name, Double cashBalance) {
        this.name = name;
        this.cashBalance = cashBalance;
        this.films = new ArrayList<Film>();
        this.awards = new ArrayList<Award>();
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "cash_balance")
    public Double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(Double cashBalance) {
        this.cashBalance = cashBalance;
    }

    @Column(name = "films")
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Column(name = "awards")
    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}


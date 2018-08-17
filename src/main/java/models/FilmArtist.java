package models;


import java.util.ArrayList;
import java.util.List;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(Double cashBalance) {
        this.cashBalance = cashBalance;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}


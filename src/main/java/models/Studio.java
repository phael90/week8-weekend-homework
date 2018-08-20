package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studios")
public class Studio {

    private int id;
    private String name;
    private double budget;
    private List<Film> films;

    public Studio(String name, double budget){
        this.name = name;
        this.budget = budget;
        this.films = new ArrayList<Film>();
    }

    public Studio(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @OneToMany(mappedBy = "studio", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilmBudget(Film film, double amount){
      budget -= amount;
      film.setBudget(film.getBudget()+amount);
    }

}

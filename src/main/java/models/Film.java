package models;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private double budget;
    private Director director;
    private Musician musician;
    //optional OntToOne filmCrew

    public Film(String title, double budget, Director director, Musician musician){
        this.title = title;
        this.budget = budget;
        this.director = director;
        this.musician = musician;

    }

    public Film(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @ManyToOne
    @JoinColumn(name ="director_id")
    public Director getDirector(){
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @ManyToOne
    @JoinColumn(name = "musician_id")
    public Musician getMusician(){
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }
}

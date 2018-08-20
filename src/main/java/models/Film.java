package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {

    private Studio studio;
    private int id;
    private String title;
    private double budget;
    private Director director;
    private Musician musician;
    private List<Casting> castings;

    public Film(Studio studio, String title, double budget, Director director, Musician musician){
        this.studio = studio;
        this.title = title;
        this.budget = budget;
        this.director = director;
        this.musician = musician;
        this.castings = new ArrayList<Casting>();
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
    @JoinColumn(name ="director_id", nullable = false)
    public Director getDirector(){
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @ManyToOne
    @JoinColumn(name = "musician_id", nullable = false)
    public Musician getMusician(){
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }

    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    public List<Casting> getCastings() {
        return castings;
    }

    public void setCastings(List<Casting> castings) {
        this.castings = castings;
    }
}

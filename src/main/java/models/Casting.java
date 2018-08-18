package models;


import javax.persistence.*;

@Entity
@Table(name = "castings")
public class Casting {

    private int id;
    private String filmTitle;
    private Actor actor;
    private Double pay;



    public Casting(String filmTitle, Actor actor, Double pay) {
        this.filmTitle = filmTitle;
        this.actor = actor;
        this.pay = pay;
    }

    public Casting() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "film_title")
    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    @ManyToOne
    @JoinColumn(name = "actor_id")
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Column(name = "pay")
    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }
}

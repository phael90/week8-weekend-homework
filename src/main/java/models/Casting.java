package models;

import javax.persistence.*;

@Entity
@Table(name = "castings")
public class Casting {

    private int id;
    private Film film;
    private Actor actor;
    private Double pay;



    public Casting(Film film, Actor actor, Double pay) {
        this.film = film;
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

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false)
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

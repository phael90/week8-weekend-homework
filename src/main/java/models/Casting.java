package models;

public class Casting {

    private int id;
    private String filmTitle;
    private Actor actor;
    private Double pay;

    public Casting() {
    }

    public Casting(String filmTitle, Actor actor, Double pay) {
        this.filmTitle = filmTitle;
        this.actor = actor;
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }
}

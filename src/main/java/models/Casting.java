package models;

public class Casting {

    private String filmTitle;
    private Actor actor;
    private Double pay;

    public Casting(String filmTitle, Actor actor, Double pay){
        this.filmTitle = filmTitle;
        this.actor = actor;
        this.pay = pay;
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

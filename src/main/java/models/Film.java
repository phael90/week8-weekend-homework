package models;

import java.util.List;

public class Film {

    private int id;
    private String title;
    private double budget;
    private List<Director> directors;
    private List<Actor> actors;
    //optional OntToOne filmCrew

    public Film(String title){
        this.title = title;
        this.budget = budget;
    }


}

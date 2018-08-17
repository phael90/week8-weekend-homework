package models;

public class Film {

    private int id;
    private String title;
    private double budget;
    //optional OntToOne filmCrew

    public Film(String title, double budget){
        this.title = title;
        this.budget = budget;
    }


}

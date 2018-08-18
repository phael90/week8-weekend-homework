package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "film_artists")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class FilmArtist {

    private int id;
    private String name;
    private Double cashBalance;
    private List<Award> awards;

    public FilmArtist(String name, Double cashBalance) {
        this.name = name;
        this.cashBalance = cashBalance;
        this.awards = new ArrayList<Award>();
    }

    public FilmArtist(){}

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

    @Column(name = "cash_balance")
    public Double getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(Double cashBalance) {
        this.cashBalance = cashBalance;
    }


    @OneToMany(mappedBy = "filmArtist", fetch = FetchType.LAZY)
    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}


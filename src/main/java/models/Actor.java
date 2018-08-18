package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor extends FilmArtist {
    private List<Casting> castings;

    public Actor(String name, Double cashBalance) {
        super(name, cashBalance);
        this.castings = new ArrayList<Casting>();
    }

    public Actor(){}


    @OneToMany(mappedBy = "actor", fetch = FetchType.LAZY)
    public List<Casting> getCastings() {
        return castings;
    }

    public void setCastings(List<Casting> castings) {
        this.castings = castings;
    }
}

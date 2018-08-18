package models;

import Enums.AwardType;
import Enums.CategoryType;
import javax.persistence.*;

@Entity
@Table(name = "awards")
public class Award {
    private int id;
    private CategoryType categoryType;
    private AwardType awardType;
    private FilmArtist filmArtist;


    public Award(CategoryType categoryType, AwardType awardType){
        this.categoryType = categoryType;
        this.awardType = awardType;
        this.filmArtist = filmArtist;
    }

    public Award(){}


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Enumerated(value = EnumType.STRING)
    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    @Enumerated(value = EnumType.STRING)
    public AwardType getAwardType() {
        return awardType;
    }

    public void setAwardType(AwardType awardType) {
        this.awardType = awardType;
    }

    @ManyToOne
    @JoinColumn(name = "film_artist_id")
    public FilmArtist getFilmArtist() {
        return filmArtist;
    }

    public void setFilmArtist(FilmArtist filmArtist) {
        this.filmArtist = filmArtist;
    }
}

import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;
import models.Musician;

public class Runner {

    public static void main(String[] args) {

        Musician musician01 = new Musician("Ennio Morricone", 2060.00);
        DBHelper.save(musician01);

        Director director01 = new Director("Quentin Tarantino", 35000000000.00);
        DBHelper.save(director01);

        Actor actor01 = new Actor("Brad Pitt", 256700543.00);
        DBHelper.save(actor01);

        Actor actor02 = new Actor("Leonardo DiCaprio", 256700543.00);
        DBHelper.save(actor02);

        Film film01 = new Film ("Once Upon a Time in Hollywood", 100000000.00, director01, musician01);
        DBHelper.save(film01);


    }
}

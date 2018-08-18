import Enums.AwardType;
import Enums.CategoryType;
import db.DBHelper;
import models.*;

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

        Film film01 = new Film("", 100000000.00, director01, musician01);
        DBHelper.save(film01);

        Award award01 = new Award(CategoryType.BEST_ACTOR, AwardType.ACADEMY_AWARDS);
        DBHelper.save(award01);

        Award award02 = new Award(CategoryType.BEST_DIRECTOR, AwardType.ACADEMY_AWARDS);
        DBHelper.save(award02);

        Award award03 = new Award(CategoryType.BEST_MUSICIAN, AwardType.ACADEMY_AWARDS);
        DBHelper.save(award03);

        Award award04 = new Award(CategoryType.BEST_ACTOR, AwardType.GOLDEN_RASPBERRY_AWARD);
        DBHelper.save(award04);

        Award award05 = new Award(CategoryType.BEST_DIRECTOR, AwardType.GOLDEN_RASPBERRY_AWARD);
        DBHelper.save(award05);

        Award award06 = new Award(CategoryType.BEST_MUSICIAN, AwardType.GOLDEN_RASPBERRY_AWARD);
        DBHelper.save(award06);


        Casting casting01 = new Casting("Once Upon a Time in Hollywood", actor01, 10000000.00);
        DBHelper.save(casting01);

        Casting casting02 = new Casting("Once Upon a Time in Hollywood", actor02, 10000000.00);
        DBHelper.save(casting02);
    }
}

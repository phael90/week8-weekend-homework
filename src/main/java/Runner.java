import Enums.AwardType;
import Enums.CategoryType;
import db.DBHelper;
import db.DBStudio;
import models.*;

public class Runner {

    public static void main(String[] args) {

        Studio studio01 = new Studio("Warner Bros", 20000000000.00 );
        DBHelper.save(studio01);

        Musician musician01 = new Musician("Ennio Morricone", 2063543630.00);
        DBHelper.save(musician01);

        Director director01 = new Director("Quentin Tarantino", 35000000000.00);
        DBHelper.save(director01);

        Director director02 = new Director("Christoper Nolan", 200000000.00);
        DBHelper.save(director02);

        Actor actor01 = new Actor("Brad Pitt", 256700543.00);
        DBHelper.save(actor01);

        Actor actor02 = new Actor("Leonardo DiCaprio", 256700543.00);
        DBHelper.save(actor02);

        Actor actor03 = new Actor("Ken Watanabe", 20000000.00);
        DBHelper.save(actor03);

        Actor actor04 = new Actor("Marion Cotilliard", 111000000.00);
        DBHelper.save(actor04);

        Film film01 = new Film(studio01,"Pulp Fiction", 8500000.00, director01, musician01);
        DBHelper.save(film01);
//        studio01.addFilmBudget(film01, 8500000.00);
//        DBHelper.update(film01);
//        DBHelper.update(studio01);
//
        Film film02 = new Film(studio01,"Inception", 0.00, director01, musician01);
        DBHelper.save(film02);
//        studio01.addFilmBudget(film02, 160000000.00);
//        DBHelper.update(film02);
//        DBHelper.update(studio01);


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

        Casting casting01 = new Casting(film01, actor01, 0.00);
        DBHelper.save(casting01);

        Casting casting02 = new Casting(film02, actor02, 0.00);
        DBHelper.save(casting02);

        DBStudio.increaseFilmBudget(studio01, film02, 50000);




    }
}

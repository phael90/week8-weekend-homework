package db;

import models.Film;
import models.Studio;

public class DBStudio {

    public static void increaseFilmBudget(Studio studio, Film film, int amount){
        studio.addFilmBudget(film, amount);
        DBHelper.update(studio);
        DBHelper.update(film);
    }
}

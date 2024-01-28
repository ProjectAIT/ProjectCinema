package version_1.main_project.src.repository;

import version_1.main_project.src.entity.Film;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilmRepository {
    private List<Film> films;
    List<Film> films2 ;

    public FilmRepository() {
        this.films = new ArrayList<>();
    }

    public void addFilm(Film film){
        films.add(film);
    }

    public void removeFilm(String name) {
        for (int i = 0; i <films.toArray().length ; i++) {
            if (films.contains(name)){
                films.remove(i);
            }
        }
    }

    public void printAll(){
        for (Film film:films) {
            System.out.println(film);
        }
    }

    public Film getFilmByName(String name) {
        Film result = null;
        for (Film film : films) {
            if (film.getFilmTitle().equalsIgnoreCase(name)) {
                return film;
            }
        }
        return result;
        }
    }







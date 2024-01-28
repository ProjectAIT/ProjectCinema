package version_1.main_project.src.services;


import version_1.main_project.src.entity.Film;
import version_1.main_project.src.interfaces.IFilm;
import version_1.main_project.src.repository.FilmRepository;

public class FilmService  implements IFilm {

public FilmRepository repository;

    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }


    public void addFilm (Film film){
        repository.addFilm(film);
    }

    public void removeFilm (String name){
        repository.removeFilm(name);
    }


    @Override
    public Film getName(String name) {
     return repository.getFilmByName(name);
    }
    @Override
    public void setName(String oldName, String newName) { // или ввести поле id
    repository.getFilmByName(oldName).setFilmTitle(newName);
    }



    @Override
    public Double getDuration(String name, Double length) {
        return repository.getFilmByName(name).getLength();
    }
    @Override
    public void setDuration(String name, Double newLength) {
        repository.getFilmByName(name).setLength(newLength);
    }



    @Override
    public String getGenre(String name) {
        return repository.getFilmByName(name).getGenre();
    }
    @Override
    public void setGenre(String name,String newGenre) {
    repository.getFilmByName(name).setGenre(newGenre);
    }



    @Override
    public Double getRating(String name) {
        return repository.getFilmByName(name).getRanking();
    }
    @Override
    public void setRating(String name, Double newRanking) {
    repository.getFilmByName(name).setRanking(newRanking);
    }



    @Override
    public String getDescription(String name) {
        return  repository.getFilmByName(name).getDescription();
    }
    @Override
    public void setDescription(String name, String newDescription) {
        repository.getFilmByName(name).setDescription(newDescription);
    }



    @Override
    public String getLanguage(String name) {
        return repository.getFilmByName(name).getLanguage();
    }
    @Override
    public void setLanguage(String name, String newLanguage) {

    }
}

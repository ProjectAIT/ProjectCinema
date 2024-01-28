package version_1.main_project.src.interfaces;

import version_1.main_project.src.entity.Film;
import version_1.main_project.src.repository.FilmRepository;

import java.util.Objects;

/**
 * Интерфейс IFilm предоставляет контракт для класса, представляющего фильм в системе управления кинотеатром.
 */
public interface IFilm {

    /**
     * Получить название фильма.
     *
     * @return Название фильма.
     */

    Object getName(String name);

    /**
     * Установить новое название фильма.
     *
     * @param name Новое название фильма.
     */
    void setName(String name1, String name2);

    /**
     * Получить продолжительность фильма в минутах.
     *
     * @return Продолжительность фильма.
     */
    Double getDuration(String name, Double newLength);

    /**
     * Установить новую продолжительность фильма.
     *
     * @param duration Продолжительность фильма в минутах.
     */

    void setDuration(String name, Double newLength);

    /**
     * Получить жанр фильма.
     *
     * @return Жанр фильма.
     */
    String getGenre(String name);

    /**
     * Установить новый жанр фильма.
     *
     * @param genre Новый жанр фильма.
     */
    void setGenre(String name, String newGenre);

    /**
     * Получить рейтинг фильма.
     *
     * @return Рейтинг фильма.
     */
    Double getRating(String name);

    /**
     * Установить новый рейтинг фильма.
     *
     * @param rating Новый рейтинг фильма.
     */
    void setRating(String name, Double newRating);

    /**
     * Получить описание фильма.
     *
     * @return Описание фильма.
     */
    String getDescription(String name);

    /**
     * Установить новое описание фильма.
     *
     * @param description Новое описание фильма.
     */
    void setDescription(String name, String newDescription);

    /**
     * Получить язык фильма.
     *
     * @return Язык фильма.
     */
    String getLanguage(String name);

    /**
     * Установить новый язык фильма.
     *
     * @param language Новый язык фильма.
     */
    void setLanguage(String name, String newLanguage);
}

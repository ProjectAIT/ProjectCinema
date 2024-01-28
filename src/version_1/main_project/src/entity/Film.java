package version_1.main_project.src.entity;

public class Film {
    private String filmTitle;
    private Double length;
    private String genre;
    private Double ranking;
    private String description;
    private String language;

    public Film(String filmTitle, Double length, String genre, Double ranking, String description, String language) {
        this.filmTitle = filmTitle;
        this.length = length;
        this.genre = genre;
        this.ranking = ranking;
        this.description = description;
        this.language = language;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRanking() {
        return ranking;
    }

    public void setRanking(Double ranking) {
        this.ranking = ranking;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmTitle='" + filmTitle + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                ", ranking=" + ranking +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

package version_1.main_project.src;

import version_1.main_project.src.entity.Film;
import version_1.main_project.src.repository.FilmRepository;
import version_1.main_project.src.services.FilmService;

public class main {

    public static void main(String[] args) {

        FilmRepository repository = new FilmRepository();
        FilmService service = new FilmService(repository);

        service.addFilm(new Film("The God Father 3", 120.00, "criminal", 4.73, "_______________", "deutsch"));
        service.addFilm(new Film("Apocalypses Today", 137.00, "history", 7.87, "_______________", "english"));
        service.addFilm(new Film("The Lord Of Rings", 220.50, "fantasy", 9.03, "_______________", "deutsch"));
        service.addFilm(new Film("Brave Hard", 150.00, "action", 6.39, "_______________", "deutsch"));

        System.out.println("Печать всей фильмотеки:\n");
        service.repository.printAll(); // печать всей фильмотеки
        System.out.println("--------------------------------------------------");

        System.out.println("Удаление фильма через название - пока не работает!!!");
        service.removeFilm("Apocalypses Today"); // не работает - !!!
        System.out.println("--------------------------------------------------");

        System.out.println("Печать всей фильмотеки:\n");
        service.repository.printAll(); // печать всей фильмотеки
        System.out.println("--------------------------------------------------");

        System.out.println("Вывод всей информации о фильме по названию:\n");
        Film findFilm = (Film) service.getName("Brave Hard"); // вывод всей информации о фильме по названию
        System.out.println(findFilm);
        System.out.println("--------------------------------------------------");

        System.out.println("Изменения названия фильма The Lord Of Rings -> The Lord Of Rings -> 3:\n");
        service.setName("The Lord Of Rings", "The Lord Of Rings -> 3!!!"); // изменение названия фильма
        service.repository.printAll();
        System.out.println("--------------------------------------------------");


       /* service.addFilm(new Film("Rokky-7", 147.00, "triller", 4.3,"-----------------", "arabysh"));
        service.repository.printAll();*/









    }
}

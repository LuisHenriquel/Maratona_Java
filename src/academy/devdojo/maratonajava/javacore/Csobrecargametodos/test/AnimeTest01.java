package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //anime.init("Naruto", 500, "TV");
        anime.init("Naruto", 500, "TV", "Ação");
        anime.imprime();
    }
}

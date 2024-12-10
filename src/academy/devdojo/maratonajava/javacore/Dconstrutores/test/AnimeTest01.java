package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Ação", 720, "TV", "IG" );

        //anime.init("Naruto", 500, "TV");
        // anime.init("Naruto", 500, "TV", "Ação");
        anime.imprime();
    }
}

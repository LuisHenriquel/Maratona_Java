package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for(int episodios : anime.getEpisodios()){
            System.out.print(episodios + " ");
        }
    }
}

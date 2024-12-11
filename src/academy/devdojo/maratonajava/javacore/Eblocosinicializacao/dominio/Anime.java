package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    //Atributos

    private String nome;

    private int[] episodios;
    //1 - Alocado espaço em memoria pro objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou quer for passada
    // 3- Bloco de inicialização é executado
    // 4 -Construtor é executadp
    {
        System.out.println("Dentro do boloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }

    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){

        for(int episodio : this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

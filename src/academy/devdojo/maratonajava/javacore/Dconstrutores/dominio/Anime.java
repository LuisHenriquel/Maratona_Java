package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    //Atributos

    private String nome;

    private String tipo;

    private int episodios;

    private String genero;

    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }
    //Sobrecarga de construtor
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    //Sobrecarga de construtor
    public Anime(){
        System.out.println("Construtor sem argumentos");
    }


//
//    public void init(String nome, int episodios, String tipo ){
//        this.nome = nome;
//        this.episodios= episodios;
//        this.tipo = tipo;
//    }
//          Sobrecarga de metodos
//    public void init(String nome, int episodios, String tipo, String genero){
//        this.init(nome, episodios, tipo);
//        this.genero = genero;
//    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}

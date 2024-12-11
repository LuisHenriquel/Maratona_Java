package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;

    private double VelocidadeMaxima;

    private static double velocidadeLimete = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        VelocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Maxima " + this.VelocidadeMaxima);
        System.out.println("Velocidade Limite " + this.velocidadeLimete);
    }

    public static void setVelocidade(double velocidadeLimete){
        Carro.velocidadeLimete = velocidadeLimete;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimete = velocidadeLimete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimete() {
        return velocidadeLimete;
    }

    public void setVelocidadeLimete(double velocidadeLimete) {
        this.velocidadeLimete = velocidadeLimete;
    }
}

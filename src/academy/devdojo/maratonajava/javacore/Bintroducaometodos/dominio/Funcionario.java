package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    //Atributos

    private String Nome;

    private int Idade;

    private double Salario;

    private double SegundoSalario;

    private double TerceiroSalario;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getSegundoSalario() {
        return SegundoSalario;
    }

    public void setSegundoSalario(double segundoSalario) {
        SegundoSalario = segundoSalario;
    }

    public double getTerceiroSalario() {
        return TerceiroSalario;
    }

    public void setTerceiroSalario(double terceiroSalario) {
        TerceiroSalario = terceiroSalario;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade()+"anos" );
    }

    public void mediaSalarios(){
        double media = (getSalario() + getSegundoSalario() + getTerceiroSalario()) / 3;
        System.out.println("A média dos 3 salarios é : " + String.format("%.3f", media) );
    }







}

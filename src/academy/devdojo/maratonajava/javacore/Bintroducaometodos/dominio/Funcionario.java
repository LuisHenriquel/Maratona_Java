package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    //Atributos

    private String Nome;

    private int Idade;

    private double[] salarios;

    private double media =0;

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }



    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprime(){
        System.out.println(this.Nome);
        System.out.println(this.Idade);
        if(salarios == null){
            return;
        }
        for (double salario : salarios){
            System.out.println(salario + " ");
        }

        imprimeMediaSalario();

    }

    public void imprimeMediaSalario(){
        if(salarios == null){
            return;
        }


        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia salarial " + media);

    }







}

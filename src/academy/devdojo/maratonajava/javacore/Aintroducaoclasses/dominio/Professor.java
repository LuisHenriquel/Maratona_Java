package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Professor {
    //Atributos

    private String Nome;

    private int idade;

    private char sexoProfessor;


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexoProfessor() {
        return sexoProfessor;
    }

    public void setSexoProfessor(char sexoProfessor) {
        this.sexoProfessor = sexoProfessor;
    }
}


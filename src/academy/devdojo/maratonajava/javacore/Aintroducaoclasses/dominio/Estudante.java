package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Estudante {
    //Atributos
    private String Nome;

    private int idade;

    private char sexo;

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}

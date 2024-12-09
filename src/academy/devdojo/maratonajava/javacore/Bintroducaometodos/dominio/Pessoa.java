package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 0 ){
            System.out.println("Coloque uma idade invalida");
            return;
        }
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }


}










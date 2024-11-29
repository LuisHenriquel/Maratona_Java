package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprimirEstudante(Estudante estudante){
        System.out.println("--------------------");

        System.out.println(estudante.getNome());
        System.out.println(estudante.getSexo());
        System.out.println(estudante.getIdade());


    }
}

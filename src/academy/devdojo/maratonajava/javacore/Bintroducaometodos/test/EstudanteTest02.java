package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.setNome("Luis");
        estudante01.setIdade(17);
        estudante01.setSexo('M');


        estudante02.setNome("Henrique");
        estudante02.setIdade(80);
        estudante02.setSexo('M');

        estudante01.imprime();
        estudante02.imprime();

    }
}

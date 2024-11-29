package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraestudante = new ImpressoraEstudante();

        estudante01.setNome("Luis");
        estudante01.setIdade(17);
        estudante01.setSexo('M');


        estudante02.setNome("Henrique");
        estudante02.setIdade(80);
        estudante02.setSexo('M');

        System.out.println(estudante01.getNome());
        System.out.println(estudante01.getIdade());
        System.out.println(estudante01.getSexo());

        System.out.println("---------------------------------");

        System.out.println(estudante02.getNome());
        System.out.println(estudante02.getIdade());
        System.out.println(estudante02.getSexo());


        impressoraestudante.imprimirEstudante(estudante01);
        impressoraestudante.imprimirEstudante(estudante02);


    }


}

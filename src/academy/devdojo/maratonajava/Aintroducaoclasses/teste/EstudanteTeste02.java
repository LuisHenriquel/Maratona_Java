package academy.devdojo.maratonajava.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Estudante;

import javax.print.attribute.standard.Destination;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println(estudante.getIdade());
        System.out.println(estudante.getNome());
        System.out.println(estudante.getSexo());
    }
}

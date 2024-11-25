package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println(estudante.getIdade());
        System.out.println(estudante.getNome());
        System.out.println(estudante.getSexo());
    }
}

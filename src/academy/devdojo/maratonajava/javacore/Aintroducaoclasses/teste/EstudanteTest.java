package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Luffy");
        estudante.setIdade(21);
        estudante.setSexo('M');

        System.out.println("Nome:" + estudante.getNome() + "\nidade: " + estudante.getIdade() + "\nSexo:" + estudante.getSexo());

    }
}
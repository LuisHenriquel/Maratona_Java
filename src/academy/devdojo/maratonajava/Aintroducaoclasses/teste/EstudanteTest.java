package academy.devdojo.maratonajava.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setNome("Luffy");
        estudante.setIdade(21);
        estudante.setSexo('M');

        System.out.println("Nome:" + estudante.getNome() + "\nidade: " + estudante.getIdade() + "\nSexo:" + estudante.getSexo());

    }
}
package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setNome("Gustavo");
        professor.setIdade(32);
        professor.setSexoProfessor('M');


        System.out.println("O nome do professor é " + professor.getNome() + "e ele tem " + professor.getIdade() + " anos " + "Sexo:" + professor.getSexoProfessor() );
    }
}

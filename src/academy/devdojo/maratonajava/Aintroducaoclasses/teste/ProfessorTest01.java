package academy.devdojo.maratonajava.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setNome("Gustavo");
        professor.setIdade(32);
        professor.setSexoProfessor('M');


        System.out.println("O nome do professor é " + professor.getNome() + "e ele tem " + professor.getIdade() + " anos " + "Sexo:" + professor.getSexoProfessor() );
    }
}

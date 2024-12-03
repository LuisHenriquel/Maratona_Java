package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Luis");
        funcionario.setIdade(17);
        funcionario.setSalario(1.800);
        funcionario.setSegundoSalario(2.500);
        funcionario.setTerceiroSalario(3.150);

        funcionario.imprimirDados();
        funcionario.mediaSalarios();

    }
}

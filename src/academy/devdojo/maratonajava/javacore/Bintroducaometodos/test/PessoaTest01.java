package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;
import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner input = new Scanner(System.in);


                System.out.println("Digite seu nome");
                String nome = input.next();
                pessoa.setNome(nome);
                input.nextLine();

                System.out.println("Digite sua idade");
                int idade = input.nextInt();
                pessoa.setIdade(idade);
                input.nextLine();

                System.out.println("Digite seu Sexo se é  'M' ou 'H'");
                char sexo = input.next().charAt(0);
                pessoa.setSexo(sexo);
                input.nextLine();

                pessoa.imprime();






    }



}

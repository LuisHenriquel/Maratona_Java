package academy.devdojo.maratonajava.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.setNome("BMW");
        carro.setModelo("320I");
        carro.setAno(2018);

        System.out.println("Nome do carro " + carro.getNome() + " o modelo é " + carro.getModelo() + " e o ano é " + carro.getAno());

        System.out.println("---------------------------------");

        carro2.setNome("Mercedes");
        carro2.setModelo("g63");
        carro2.setAno(2022);

        System.out.println("Nome do carro " + carro2.getNome() + " o modelo é " + carro2.getModelo() + " e o ano é " + carro2.getAno());




    }
}

package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);

    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2){
        int total = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " x " + numero2 + " é: " + total);
    }


    public double  divideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        double total = num1 / num2;
        return  total;
    }

}

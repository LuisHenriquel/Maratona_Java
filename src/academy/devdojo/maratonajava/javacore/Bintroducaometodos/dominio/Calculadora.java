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
          return  num1 / num2;

    }
    public double  divideDoisNumeros02(double num1, double num2){
            if(num2 != 0){
                return num1 / num2;
            }
            return 0;

    }



    public void  imprimeDivideDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

}

package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char 1\u0000' ' '
        // boolean false
        // String null
        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Kurosake";
        nomes[2] = "Luffy ";



            for (int i = 0; i <3; i++){
                System.out.println(nomes[i]);
            }

    }


}

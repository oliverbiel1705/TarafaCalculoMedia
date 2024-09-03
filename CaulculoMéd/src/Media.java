import java.util.Scanner;

public class Media {


    private static float soma;

    public static void main(String[] args) {
       float soma = 0;
       float mediafinal;

       notas();
       media();

   }

    private static float lerTeclado() {
       float valor;
           Scanner ler = new Scanner(System.in);
           valor = ler.nextFloat();
           return valor;
       }


    private static float notas() {
        int i;
        float[] number = new float[10];
        for (i = 0; i < 4; i++) {
            System.out.println("Informe uma nota  de 0 a 10: " + (i+1));
            number[i] = lerTeclado();
            if (number[i] > 10 || number[i] <0){
                System.out.println("Número tem que ser entre 0 e 10");
                i--;
            }
            else {
                soma += number[i];
            }
        }
        return soma;

    }

    private static void media() {
        float mediaFinal;
        System.out.println("Media Final = ");
        System.out.println(mediaFinal = soma / 4);
    }
}

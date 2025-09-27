import java.util.Random;

public class dado {

    public static void main(String[] args) {
        
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;

        int dado2 = random.nextInt(6) + 1;

        int soma = dado1 + dado2;

        System.out.println("Lançando os dados...");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Soma: " + soma);
    }
}
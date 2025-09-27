import java.util.Random;

public class GeradorNumeroAleatorio {

    public static void main(String[] args) {
        
        Random random = new Random();

        
        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("O número inteiro aleatório gerado é: " + numeroAleatorio);
    }
}
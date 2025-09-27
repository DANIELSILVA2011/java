import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor mínimo do intervalo: ");
        int min = scanner.nextInt();

        System.out.print("Digite o valor máximo do intervalo: ");
        int max = scanner.nextInt();

        
        scanner.close();

        int numeroAleatorio = (int)(Math.random() * (max - min + 1)) + min;

        System.out.println("-----------------------------------------");
        System.out.println("Sorteando um número entre " + min + " e " + max + "...");
        System.out.println("O número aleatório gerado foi: " + numeroAleatorio);
    }
}

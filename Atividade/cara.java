import java.util.Random;

public class cara {

    public static void main(String[] args) {
       
        Random random = new Random();

        int resultado = random.nextInt(2);

        if (resultado == 0) {
            System.out.println("Resultado: Cara");
        } else {
            System.out.println("Resultado: Coroa");
        }
        System.out.println("(Número sorteado: " + resultado + ")");
    }
}

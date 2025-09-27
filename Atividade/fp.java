import java.text.DecimalFormat;

public class fp {

    public static void main(String[] args) {
        
        double numeroAleatorio = Math.random() * 10;

        System.out.println("Número original gerado: " + numeroAleatorio);

       
        String numeroFormatado = String.format("%.2f", numeroAleatorio);

        System.out.println("Número arredondado para 2 casas decimais: " + numeroFormatado);
    }
}

public class ca {

    public static void main(String[] args) {
       
        int num1 = (int)(Math.random() * 50) + 1;
        int num2 = (int)(Math.random() * 50) + 1;
        int num3 = (int)(Math.random() * 50) + 1;

        System.out.println("Os três números gerados foram: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("-----------------------------------------");

        int maior = Math.max(num1, Math.max(num2, num3));

        int menor = Math.min(num1, Math.min(num2, num3));

        System.out.println("O maior número entre eles é: " + maior);
        System.out.println("O menor número entre eles é: " + menor);
    }
}
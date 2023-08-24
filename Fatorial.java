import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser um inteiro não negativo.");
        } else {
            BigInteger fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial.toString());
            System.out.println("O fatorial de " + numero + " é: " + fatorial.toString().length() + " dígitos");
            System.out.println("O fatorial de " + numero + " em notaçao cientifica é: " + formatarFatorial(fatorial));
        }
    }

    public static BigInteger calcularFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        return fatorial;
    }

    public static String formatarFatorial(BigInteger fatorial) {
        String fatorialString = fatorial.toString();
        int length = fatorialString.length();

        if (length > 6) {
            String base = fatorialString.substring(0, 1) + "." + fatorialString.substring(1, 4);
            int exponent = length - 1;
            return base + "e" + exponent;
        } else {
            return fatorialString;
        }
    }
}

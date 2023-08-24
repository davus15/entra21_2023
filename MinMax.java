import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Digite um número inteiro ou 'n' para parar: ");
            String input = scanner.nextLine();

            if (input.equals("n")) {
                break;
            } else {
                int numero = Integer.parseInt(input);
                if (numero > maiorValor) {
                    maiorValor = numero;
                }
                if (numero < menorValor) {
                    menorValor = numero;
                }
            }
        }

        System.out.println("O menor valor é: " + menorValor);
        System.out.println("O maior valor é: " + maiorValor);
    }
}

import java.util.Scanner;

public class LojaDepartamentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalRecebido = 0;

        while (true) {
            System.out.print("Digite o valor da compra (ou 0 para finalizar): R$ ");
            double valorCompra = scanner.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            double desconto = 0;
            if (valorCompra > 500) {
                desconto = valorCompra * 0.2;
            } else {
                desconto = valorCompra * 0.15;
            }

            double totalPagar = valorCompra - desconto;
            totalRecebido += totalPagar;

            System.out.println("Total a pagar: R$ " + totalPagar);
        }

        System.out.println("Total recebido pela loja no dia: R$ " + totalRecebido);

        scanner.close();
    }
}

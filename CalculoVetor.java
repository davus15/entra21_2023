import java.util.Scanner;

public class CalculoVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[100];
        int tamanhoVetor = 0;

        System.out.println("Insira valores decimais. Digite 'n' para parar.");

        while (tamanhoVetor < vetor.length) {
            System.out.print("Informe o valor: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("n")) {
                break;
            }

            try {
                double valor = Double.parseDouble(entrada);
                vetor[tamanhoVetor] = valor;
                tamanhoVetor++;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }

        if (tamanhoVetor > 0) {
            double menor = vetor[0];
            double maior = vetor[0];
            double soma = 0;

            for (int i = 0; i < tamanhoVetor; i++) {
                double valor = vetor[i];

                if (valor < menor) {
                    menor = valor;
                }

                if (valor > maior) {
                    maior = valor;
                }

                soma += valor;
            }

            double media = soma / tamanhoVetor;

            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhum valor foi inserido.");
        }

        scanner.close();
    }
}

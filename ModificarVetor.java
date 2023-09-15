import java.util.Scanner;

public class ModificarVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[12];

        System.out.println("Insira 12 valores decimais:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            if ((i + 1) % 2 == 0) {
                vetor[i] += vetor[i] * 0.02; 
            } else {
                vetor[i] += vetor[i] * 0.05; 
            }
        }

        System.out.println("Vetor resultante:");

        for (double valor : vetor) {
            System.out.println(valor);
        }

        scanner.close();
    }
}

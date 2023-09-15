import java.util.Scanner;

public class InserirNumeroIndice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50];
        int tamanhoVetor = 0;

        System.out.print("Informe o número a ser inserido: ");
        int numero = scanner.nextInt();

        System.out.print("Informe o índice onde o número será inserido (entre 0 e " + tamanhoVetor + "): ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice <= tamanhoVetor) {
            
            for (int i = tamanhoVetor - 1; i >= indice; i--) {
                vetor[i + 1] = vetor[i];
            }

         
            vetor[indice] = numero;

            tamanhoVetor++; 
            System.out.println("Número inserido no índice " + indice + " do vetor.");
        } else {
            System.out.println("Índice inválido. O índice deve estar entre 0 e " + tamanhoVetor + ".");
        }

        scanner.close();
    }
}

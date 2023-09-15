import java.util.Scanner;

public class MenuVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50]; 
        int tamanhoVetor = 0; 

        int opcao;
        do {
            System.out.println("---- Menu ----");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Mostrar valores");
            System.out.println("5 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (tamanhoVetor < vetor.length) {
                        System.out.print("Informe o valor a ser incluído: ");
                        int valorIncluir = scanner.nextInt();
                        vetor[tamanhoVetor] = valorIncluir;
                        tamanhoVetor++;
                        System.out.println("Valor incluído no vetor.");
                    } else {
                        System.out.println("O vetor está cheio. Não é possível incluir o valor.");
                    }
                    break;

                case 2:
                    System.out.print("Informe o valor a ser pesquisado: ");
                    int valorPesquisar = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < tamanhoVetor; i++) {
                        if (vetor[i] == valorPesquisar) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("O valor está presente no vetor.");
                    } else {
                        System.out.println("O valor não está presente no vetor.");
                    }
                    break;

                case 3:
                    System.out.print("Informe o número a ser alterado: ");
                    int numeroAlterar = scanner.nextInt();
                    System.out.print("Informe o novo número: ");
                    int novoNumero = scanner.nextInt();
                    boolean numeroEncontrado = false;
                    for (int i = 0; i < tamanhoVetor; i++) {
                        if (vetor[i] == numeroAlterar) {
                            vetor[i] = novoNumero;
                            numeroEncontrado = true;
                            break;
                        }
                    }
                    if (numeroEncontrado) {
                        System.out.println("Número alterado no vetor.");
                    } else {
                        System.out.println("Número não encontrado no vetor.");
                    }
                    break;

                case 4:
                    if (tamanhoVetor > 0) {
                        System.out.println("Valores armazenados no vetor:");
                        for (int i = 0; i < tamanhoVetor; i++) {
                            System.out.println(vetor[i]);
                        }
                    } else {
                        System.out.println("O vetor está vazio. Não há valores a serem mostrados.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }

            System.out.println();
        } while (opcao != 5);

        scanner.close();
    }
}

import java.util.Scanner;

public class CalculadoraMediaTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeAlunos = 0;
        double somaNotas = 0;

        System.out.println("Digite o nome do aluno ou 'fim' para encerrar a leitura:");

        while (true) {
            System.out.print("Nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            if (nomeAluno.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Nota da prova 1: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Nota da prova 2: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Nota da prova 3: ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine();

            double media = (nota1 + nota2 + nota3) / 3.0;
            System.out.println("Média do aluno " + nomeAluno + ": " + media);
            
            quantidadeAlunos++;
            somaNotas += media;
        }
        
        double mediaTurma = somaNotas / quantidadeAlunos;
        System.out.println("Média da turma: " + mediaTurma);

        scanner.close();
    }
}

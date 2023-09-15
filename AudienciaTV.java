import java.util.Scanner;

public class AudienciaTV {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] canalAudiencia = { 4, 5, 9, 12 };
        int[] totalAudiencia = new int[4];
        int totalCasasVisitadas = 0;

        while (true) {
            System.out.print("Digite o número do canal (ou 'fim' para encerrar): ");
            String canalDigitado = scanner.nextLine();

            if (canalDigitado.equalsIgnoreCase("fim")) {
                break;
            }

            int canal = Integer.parseInt(canalDigitado);

            System.out.print("Digite o número de pessoas assistindo: ");
            int numeroPessoas = scanner.nextInt();

            scanner.nextLine(); 

            for (int i = 0; i < canalAudiencia.length; i++) {
                if (canal == canalAudiencia[i]) {
                    totalAudiencia[i] += numeroPessoas;
                    totalCasasVisitadas++;
                    break;
                }
            }
        }

        System.out.println("---- Relatório de Audiência por Canal ----");

        for (int i = 0; i < canalAudiencia.length; i++) {
            double percentualAudiencia = (double) totalAudiencia[i] / totalCasasVisitadas * 100;
            System.out.println("Canal " + canalAudiencia[i] + ": " + percentualAudiencia + "%");
        }

        scanner.close();
    }
}

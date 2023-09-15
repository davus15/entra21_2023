
import java.util.Scanner;

public class MaterialRadioativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa inicial em Kg do material radioativo: ");
        double massaInicial = scanner.nextDouble();

        double massaFinal = 0.0005;
        double massaAtual = massaInicial;
        int tempo = 0;

        while (massaAtual >= massaFinal) {
            massaAtual /= 2;
            tempo += 50;
        }

        System.out.println("Massa inicial: " + massaInicial + " Kg");
        System.out.println("Massa final: " + massaFinal + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");

        scanner.close();
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	
			DecimalFormat df = new DecimalFormat("0.0");
			
			System.out.println("bote a nota 1 ");
			double nota1 = input.nextDouble();
			System.out.println("bota a nota 2");
			double nota2 = input.nextDouble();
            double media = (nota1 * 0.35) + (nota2 * 0.65);
            System.out.println("sua media é " + df.format(media));
	}

}

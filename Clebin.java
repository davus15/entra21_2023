import java.text.DecimalFormat;
import java.util.Scanner;

public class Clebin {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner input = new Scanner(System.in)) {
	DecimalFormat df = new DecimalFormat("0.0");
	
	System.out.println("escreva a 1ª nota ");
	double nota1 = input.nextDouble();
	System.out.println("escreva a 2ª nota ");
	double nota2 = input.nextDouble();
	System.out.println("escreva a 3ª nota ");
	double nota3 = input.nextDouble();
	double media = (nota1 + nota2 + nota3)/3;
	System.out.println("sua media é " + df.format(media));
}
	}

}

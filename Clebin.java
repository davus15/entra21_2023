import java.text.DecimalFormat;
import java.util.Scanner;

public class Clebin {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner input = new Scanner(System.in)) {
	DecimalFormat df = new DecimalFormat("0.0");
	
	System.out.println("escreva a 1� nota ");
	double nota1 = input.nextDouble();
	System.out.println("escreva a 2� nota ");
	double nota2 = input.nextDouble();
	System.out.println("escreva a 3� nota ");
	double nota3 = input.nextDouble();
	double media = (nota1 + nota2 + nota3)/3;
	System.out.println("sua media � " + df.format(media));
}
	}

}

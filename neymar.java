import java.text.DecimalFormat;
import java.util.Scanner;

public class neymar {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	System.out.println("informe o primjeiro numero ");
	int numero1 = input.nextInt();
	System.out.println("informe o segundo numero ");
	int numero2 = input.nextInt();
	if ( numero1 > numero2 )
			System.out.println("o primeiro numero é maior");
     else System.out.println("o segundo numero é maior");
	
}
}
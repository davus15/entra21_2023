import java.text.DecimalFormat;
import java.util.Scanner;

public class claudia_leite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("bote o valor 1 ");
		double val1 = input.nextDouble();
		System.out.println("bote o valor 2");
		double val2 = input.nextDouble();
		System.out.println("bote o valor 3");
		double val3 = input.nextDouble();
		System.out.println("bote o valor 4 ");
		double val4 = input.nextDouble();
        double valorfinal = (val1 + val2) - (val3 + val4);
        System.out.println("a diferença de valor é " + df.format(valorfinal));
        

	}

}

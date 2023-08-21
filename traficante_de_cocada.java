import java.text.DecimalFormat;
import java.util.Scanner;

public class traficante_de_cocada {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("informe quntos reais vc quer trocar ");
		double reais = input.nextDouble();
		System.out.println("informe o valor do dolar hoje ");
		double dol = input.nextDouble();
		double doltax = (dol * 0.15) + dol;
        double total = reais/doltax;		
        System.out.println("vc converteu " + df.format(reais) + " reais para " + df.format(total) + "dolares" );
	}

}

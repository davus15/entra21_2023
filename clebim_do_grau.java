import java.text.DecimalFormat;
import java.util.Scanner;

public class clebim_do_grau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("informe o seu nome ");
		String nome = input.next();
		System.out.println("informe o seu salario fixo ");
		double sal = input.nextDouble();
		System.out.println("informe quanto vc vendeu em dinheiro ");
		double venda = input.nextDouble();
		double comissao = (venda * 0.15);
		double salfinal = sal + comissao;
		System.out.println("seu nome � " + nome + "seu salario fixo � " + sal + " seu salario final � " + df.format(salfinal));
	}

}

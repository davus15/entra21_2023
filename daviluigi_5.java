
	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class daviluigi_5 {

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
			double comissao = (venda * 0.30);
			double salfinal = sal + comissao;
			System.out.println("seu nome é " + nome + "seu salario fixo é " + sal + " seu salario final é " + df.format(salfinal));
		}

	}

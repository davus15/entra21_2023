import java.text.DecimalFormat;
import java.util.Scanner;

public class morgan_freeman { 

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("informe o seu numero de funcionario ");
		double num = input.nextDouble();
		System.out.println("informe as horas trabalhadas ");
		double horas = input.nextDouble();
		System.out.println("informe quanto vc ganha por hora ");
		double money = input.nextDouble();
		double sal = money * horas;
		System.out.println("seu numero é " + num + " seu salario é " + sal);
		

	}

}

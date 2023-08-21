import java.util.Scanner;

public class robocop_gay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("quantos anos vc tem");
		int ano = input.nextInt();
		if (ano <=7 && ano >= 5) {
			System.out.println("pre-mirin");
			}
		
		else if (ano <=10 && ano >= 8) {System.out.println("mirim");}
		
		else if (ano <=13 && ano >= 11) { System.out.println("infantil"); }
		
		else if (ano <=17 && ano >=14 ) {System.out.println("infanto-juvenil");}
		
		else if (ano <=20 && ano >=18 ) {System.out.println ("juvenil");}
		
		else if (ano <=4 && ano >=0 ) {System.out.println("sem nataçao");}
		
		else {System.out.println("adulto");}
	}

}

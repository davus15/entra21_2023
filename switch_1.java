import java.util.Scanner;
public class switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println(" escreva 1 para adicionar 2 para subtrair 3 para multiplicar e 4 para dividir");
int caso = input.nextInt();
System.out.println("escreva o numero 1");
double num1 = input.nextDouble();
System.out.println("escreva o numero 2");
double num2 = input.nextDouble();
switch(caso) {
case 1: System.out.println("o numero é " + (num1 + num2)); break;
case 2: System.out.println("o numero é " + (num1 - num2));break;
case 3: System.out.println("o numero é " + (num1 * num2));break;
case 4: System.out.println("o numero é " + (num1 / num2));break;

}


		
		
		
	}

}

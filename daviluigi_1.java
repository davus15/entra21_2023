import java.util.Scanner;
import java.text.DecimalFormat;
public class daviluigi_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
System.out.println("escreva 1 para converter dollar para real e 2 para converter real para dolar");
int convert = input.nextInt();
if (convert == 1 || convert == 2) {
	


System.out.println("escreva a quantia de reais ou dollares ");
double money = input.nextDouble();
switch (convert) {
case 1: {System.out.println("voce recebeu " + df.format(money * 4.89) + " reais" );}break;
case 2: { System.out.println("voce recebeu " + df.format(money / 4.89) + " dolares");}break;
	
}
	}else {System.out.println("numero invalido " );

		
	}
}

}

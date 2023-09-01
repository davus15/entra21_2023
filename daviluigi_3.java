import java.util.Scanner;
import java.text.DecimalFormat;

public class daviluigi_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

double altura = 0;

int i = 0;
while(i <10 ) {
i++;
System.out.println("escreva a  altura em metros");
 
double altura2 = input.nextDouble();
 altura = altura + altura2;
		
		}double media = altura /10; 
		System.out.println("a media das alturas é " + df.format(media));
	}

}

import java.util.Scanner;

public class amabile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
for( int i = 0; i < 6; i++){
System.out.println("escreva um numero entre 0 e 1000");
int numero = input.nextInt();

if (numero <=1000 && numero >= 0) {
	System.out.println(numero + " esta entre 0 e 1000");
}else {
	System.out.println("numero incorreto");
}

	}

}}

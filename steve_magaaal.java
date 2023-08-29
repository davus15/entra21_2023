import java.util.Scanner;
public class steve_magaaal {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int maior = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		int soma = 0;
		int media = 0;
		int num[] = new int[5];
		for(int i = 0; i < num.length; i++) {
	         System.out.println("qual é numero " + (i + 1) );
	         num[i] = input.nextInt();}
	         for(int i = num.length - 1; i >= 0 ; i--) {
	        	 System.out.println("o valor " + (i + 1 ) + " é " + num[i]);
	        	 if (num[i] < maior) {
					maior = num[i];
				};
				if (num[i] > menor) {
					menor = num[i];
				};
	        	 soma = num[i] + soma;
	        	 
	} media = soma /5; 
System.out.println("o maior numero é " + maior + "\n o menor numero é " + menor + "\n a media é " + media );
	}}

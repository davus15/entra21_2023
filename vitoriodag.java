import java.util.Scanner;
public class vitoriodag {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num[] = new int[5];
		for(int i = 0; i < num.length; i++) {
	         System.out.println("qual é numero " + (i + 1) );
	         num[i] = input.nextInt();}
	         for(int i = num.length - 1; i >= 0 ; i--) {
	        	 System.out.println("o valor " + (i + 1 ) + " é " + num[i]);
	        	 
	}

}}

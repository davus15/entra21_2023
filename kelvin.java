import java.util.Scanner;
public class kelvin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("quantos familiares vc tem");
		int familiares = input.nextInt();
         int fami1[] = new int[familiares];
		 for(int i = 0; i < fami1.length; i++) {
         System.out.println("quantos anos tem o familiar numero " + (i + 1) );
         fami1[i] = input.nextInt();
         System.out.println("\n o familiar numero " + (i + 1) + " tem " + fami1[i] + " anos  \n");
	} 

}}

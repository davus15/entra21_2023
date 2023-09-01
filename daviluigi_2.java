import java.util.Scanner;

public class daviluigi_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		

		System.out.println("escreva o lado 1");
		int l1 = input.nextInt();
		System.out.println("escreva o lado 2");
		int l2 = input.nextInt();
		System.out.println("escreva o lado 3");
		int l3 = input.nextInt();
		
		if (l1 + l2 + l3 == l1 *3   ) {
			System.out.println("triangulo equilatero");
		}else if(l1 != l2 && l1 != l3 && l2 != l3 ) {
			System.out.println("triangulo isóciles");

			
		}else {System.out.println("triangulo escaleno");

			
		}
		
	}
	

}

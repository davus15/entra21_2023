import java.util.Scanner;

public class loe_lins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("escreva o dia  ");
		
		
		int dia = input.nextInt();
		System.out.println("escreva o mes  ");
		int mes1 = input.nextInt();
		System.out.println("escreva o ano  ");
		int ano = input.nextInt();
		
		if ( dia <= 31 && dia > 0) {
			if (mes1 <= 12 && mes1> 0) {
				if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
					if (dia <= 30 && dia > 0) {
						if (mes1 == 2 ) {
							if (dia <= 29 && dia > 0) {
								
						if (ano % 4 == 0) { 
					System.out.println( "a data é " + dia + "/" + mes1 + "/" +  ano);
					System.out.println("o ano é bissexto");
				 }
					else { System.out.println("data incorreta ");} }
						else {System.out.println("data invalida");
								
							}
						} else {
							
							if (ano % 4 == 0) {
						System.out.println( "a data é " + dia + "/" + mes1 + "/" +  ano);
						System.out.println("o ano é bissexto");
					 }
						else { System.out.println( "a data é " + dia + "/" + mes1 + "/" +  ano);
						System.out.println("o ano nao é bissexto");} }
						} else {System.out.println("data incorreta ");

					}
				
			
				
				
			
			
	}	
				}
				}
									
				}
		 

		
			
			
	
		
		
		
}
		
		
	


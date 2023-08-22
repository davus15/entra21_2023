import java.util.Scanner;
public class farinha {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double altura = 0;
System.out.println("escreva a altura em metros");
int quant = 0;
double altura2 = input.nextDouble();
while(altura2 != 0){
	
	
	System.out.println("escreva a altura em metros, se quiser acabar com o programa escreva 0 ");
	 
	 altura2 = input.nextDouble();
	altura = altura + altura2;
quant++;
	
} double media = altura / quant; 
System.out.println("a media das alturas é " + media);

	
	}

}

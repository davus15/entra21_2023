import java.util.Scanner;

public class linhares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
int altura = 0;

int i = 0;
while(i <5 ) {
i++;
System.out.println("escreva a sua altura em metros");
 
int altura2 = input.nextInt();
 altura = altura + altura2;
		
		}int media = altura /5; 
		System.out.println("a media das alturas é " + media);
	}

}

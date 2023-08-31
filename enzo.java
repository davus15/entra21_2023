import java.util.Scanner;

public class enzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("escreva a posiçao que vc quer que o numero fique ");
		int posiçao = input.nextInt();
	System.out.println("escreva o numero ");
	int numero = input.nextInt();
	System.out.println("escreva a quantidade de posiçoes do vetor");
	int quantidade = input.nextInt();
	int vetor[] = new int[quantidade];   
		
		for(int i = 0; i < vetor.length;i++) {
			   vetor[i] = 1 + i * i;}
			   for( int i = 0; i < vetor.length;i++) {
		          vetor[posiçao] = numero;
                   System.out.println(vetor[i]);
	}

}}

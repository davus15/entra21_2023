import java.util.Scanner;

public class bruno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("escreva a posiçao que vc quer que o numero zero fique ");
		int posiçao = input.nextInt();
		int vetor[] = new int[5];   
		
		for(int i = 0; i < vetor.length;i++) {
			   vetor[i] = 1 + i * i;}
			   for( int i = 0; i < vetor.length;i++) {
		          vetor[posiçao] = 0;
                   System.out.println(vetor[i]);
	}

}}

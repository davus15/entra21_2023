import java.util.Scanner;

public class daviluigi_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menorV = Integer.MAX_VALUE;
        int maiorV = Integer.MIN_VALUE;
       System.out.println(" escreva a nota 1");
        double not1 = input.nextInt();
        System.out.println(" escreva a nota 2");
        double not2 = input.nextInt();
        System.out.println(" escreva a nota 3");
        double not3 = input.nextInt();
        double media = (not1 + not2 + not3) / 3;
        System.out.println("bote o nome");
        String nome = input.next();
        System.out.println("bote o email");
        String email = input.next();
System.out.println(" a media  do aluno " + nome +" foi " + media + " e o email é " + email)  ;
	}

}

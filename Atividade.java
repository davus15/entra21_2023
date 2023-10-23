import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);

		System.out.println("escreva 1 pra retangulo 2 pra triangulo 3 pra circulo");
		int forma = imput.nextInt();
		
		switch (forma) {
		case 1: { 
			System.out.println("escreva a base");
			double base = imput.nextInt();

			System.out.println("escreva a altura");
			double altura = imput.nextInt();
			if (base == altura )
			{throw new IllegalArgumentException(" isso é um quadrado"  );
				
			}else {
				double area = (altura * base);
				System.out.println("a area do retangulo sera: " + area);
			}
		}
		case 2: {
			System.out.println("escreva a base");
			double base = imput.nextInt();

			System.out.println("escreva a altura");
			double altura = imput.nextInt();
			 double area = (altura * base)/2 ;
			System.out.println("a area do triangulo sera: " + area  );
			}
		case 3:{
			System.out.println("escreva o raio");
			double raio = imput.nextInt();
			double area = (raio * raio) * Math.PI;
			System.out.println("a area do circulo sera " + area);
		}
			
		}
	
		}
	}



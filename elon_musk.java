import java.util.Scanner;

public class elon_musk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
    System.out.println("escreva o seu salario ");
	int sal = input.nextInt();
	System.out.println("escreva suas horas trabalhadas ");
	int horas = input.nextInt();
	
	if (horas > 0 && horas < 730) {
		double salhora = sal / 160;
    double horaExtra = horas - 160  ;
    double horaExtra1 = horaExtra * salhora ;
	double horaExtra2 = horaExtra / 2;
	double salFinal = horaExtra1 + horaExtra2;
	double salfinalReal = sal + salFinal;
	System.out.println(" voce trabalhou " + horas +" horas. \n teve " + horaExtra + " horas extra. \n recebeu " + salFinal + " reais pela hora extra total,"+ "\n no total va recebeu " + salfinalReal + " reais");
	
	} else System.out.println("horas incorretas");
	
	
	}

}

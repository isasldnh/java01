package introducao;

import java.util.Scanner;

public class CalcMediaJava {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o n�mero: ");
		n1=ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2=ler.nextInt();
		media=(n1+n2)/2;
		System.out.println("A m�dia �: " +media);

	}

}

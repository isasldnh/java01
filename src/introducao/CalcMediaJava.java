package introducao;

import java.util.Scanner;

public class CalcMediaJava {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o número: ");
		n1=ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2=ler.nextInt();
		media=(n1+n2)/2;
		System.out.println("A média é: " +media);

	}

}

package introducao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int anos, meses, dias, idade;
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira sua idade em anos: ");
		anos= ler.nextInt();
		System.out.println("Escreva sua idade em meses: ");
		meses=ler.nextInt();
		System.out.println("Escreva sua idade em dias: ");
		dias=ler.nextInt();
		idade = anos*360+meses*30+dias;
		System.out.println("Sua idade em dias é" +idade);
	}

}

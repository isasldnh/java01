package introducao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int anos, meses, dias, idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		anos = idade/360;
		meses = (idade-(360*anos))/30;
		dias = (idade - (360*anos))/30;
		System.out.println("Sua idade é " +anos+ " anos" +meses+ " meses" +dias+ "dias");
	}

}

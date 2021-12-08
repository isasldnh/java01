package introducao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int horas, minutos, segundos, evento;
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva a duração do evento em segundos: ");
		evento=ler.nextInt();
		horas = evento/3600;
		minutos = (evento - (360*horas))/60;
		segundos = (evento -(360*horas))%60;
		System.out.println("A duração do evento é " +horas+ " horas" +minutos+ " minutos e " +segundos+ " segundos.");

	}

}

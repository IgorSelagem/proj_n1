package proj_n1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		
		// Feito por Igor Mendes Selagem
		
		Scanner teclado = new Scanner(System.in);
		int jogador;
		int cpu;
		System.out.println("Prepare-se!! Est� prestes a come�ar o jogo de PEDRA, PAPEL OU TESOURA!!!");
		System.out.println("       ~ ~              ~ ~              ~ ~              ~ ~       ");
		System.out.println("Op��o 1: Pedra");
		System.out.println("Op��o 2: Papel");
		System.out.println("Op��o 3: Tesoura");
		System.out.println("");
		System.out.println("Qual a sua arma?");

		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Voc� escolheu PEDRA.");
			break;
		case 2:
			System.out.println("Voc� escolheu PAPEL.");
			break;
		case 3:
			System.out.println("Voc� escolheu TESOURA.");
			break;
		default:
			System.out.println("Op��o inv�lida! Tente novamente.");
			break;
		}

		cpu = (int) (Math.random() * 3 + 1);
		switch (cpu) {
		case 1:
			System.out.println("Oponente escolheu PEDRA.");
			break;
		case 2:
			System.out.println("Oponente escolheu PAPEL.");
			break;
		case 3:
			System.out.println("Oponente escolheu TESOURA.");
			break;
		}
		if(jogador == cpu) {
			System.out.println("Empate!");
		}else {
			if ((jogador == 1 && cpu == 3) || (jogador == 2 && cpu == 1) || (jogador == 3 && cpu == 2)) {
				System.out.println("VOC� VENCEU!!");
			}else {
				System.out.println("CPU VENCEU!!");
			}
		}
	}
}

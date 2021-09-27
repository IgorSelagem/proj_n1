package proj_n1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		
		// Feito por Igor Mendes Selagem
		
		Scanner teclado = new Scanner(System.in);
		int jogador;
		int cpu;
		System.out.println("Prepare-se!! Está prestes a começar o jogo de PEDRA, PAPEL OU TESOURA!!!");
		System.out.println("       ~ ~              ~ ~              ~ ~              ~ ~       ");
		System.out.println("Opção 1: Pedra");
		System.out.println("Opção 2: Papel");
		System.out.println("Opção 3: Tesoura");
		System.out.println("");
		System.out.println("Qual a sua arma?");

		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Você escolheu PEDRA.");
			break;
		case 2:
			System.out.println("Você escolheu PAPEL.");
			break;
		case 3:
			System.out.println("Você escolheu TESOURA.");
			break;
		default:
			System.out.println("Opção inválida! Tente novamente.");
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
				System.out.println("VOCÊ VENCEU!!");
			}else {
				System.out.println("CPU VENCEU!!");
			}
		}
	}
}

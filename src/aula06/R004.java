package aula06;

import java.util.Scanner;

/*
R004 Faça um algoritmo que escreva 
     todos os números múltiplos de 3 entre 1 e N, 
     sendo N um valor digitado pelo usuário.
*/

public class R004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = ler.nextInt();
		
		for (;numero >= 3; numero--) {
			if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}
		ler.close();
	}
}

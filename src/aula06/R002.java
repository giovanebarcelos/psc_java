package aula06;

import java.util.Scanner;

/*
  R002 Escreva um algoritmo que leia indefinidamente 
  números até que seja digitado o número zero. 
  Ao final imprimir o menor e o maior números lidos
*/

public class R002 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero = -1;
		int menorNumero = Integer.MAX_VALUE;
		int maiorNumero = Integer.MIN_VALUE;
		
		while (numero != 0) {
			System.out.print("Número: ");
			numero = ler.nextInt();
			
			if (numero < menorNumero && numero != 0) {
				menorNumero = numero;
			}
			if (numero > maiorNumero && numero != 0) {
				maiorNumero = numero;
			}
			
		}
		System.out.printf("Menor Número = %d e Maior= %d",
				menorNumero, maiorNumero);
		ler.close();
	}

}

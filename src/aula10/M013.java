package aula10;

import java.util.Scanner;

/*
  Ler um vetor A de 3 números.  
  Após, ler mais um número e pesquisar se esta contido 
  o número no vetor
*/  

public class M013 {

	public static void main(String[] args) {
		int[] numeros = new int[3];
		Scanner ler = new Scanner(System.in);
		
		// Ler os valores para posição
		for (int posicao = 0;
			 posicao < numeros.length;
			 posicao = posicao + 1) {
			System.out.printf("Número [%d]:", 
					         posicao);
			numeros[posicao] = ler.nextInt();			
		}
		
		System.out.print("Número de referëncia: ");
		int numero = ler.nextInt();
		
		if ( estaContido(numero, numeros) ){
			System.out.println("Eureka! Achei o número");
		} else {
			System.out.println("Não Achei o número");
		}
	}

	private static boolean estaContido(int numero, int[] numeros) {
		int posicao = 0;
		
		while (posicao < numeros.length) {
			if (numero == numeros[posicao]) {
				return true;
			}
			
			posicao++;
		}
		return false;
	}
}

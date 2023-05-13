package aula26;

import java.util.Scanner;

/*
 Faça um algoritmo que armazena números inteiros 
 em uma matriz quadrada (quantidade de listas e 
 colunas iguais) de tamanho definido pelo usuário (n) 
 e que verifica quantos deses números armazenados 
 na diagonal secundária da matriz são primos.
 
 */

public class Matriz {

	private Integer[][] matriz;

	public Matriz(int tamanhoMatriz) {
		this.matriz = new Integer[tamanhoMatriz][tamanhoMatriz]; 
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		System.out.print("Qual o tamanho da matriz? ");
		int tamanhoMatriz = ler.nextInt();
		
		Matriz matriz = new Matriz(tamanhoMatriz);
		
		matriz.lerNumerosPeloTeclado();
		//matriz.preenchaAutomaticamente();
		
		int qtdePrimosDiagonalSecundaria = 
				matriz.getQtdePrimosDiagonalSecundaria();
		
		System.out.println("Quantidade de primos = "+
		                   qtdePrimosDiagonalSecundaria);

	}

	private int getQtdePrimosDiagonalSecundaria() {
		int qtdePrimosSecundaria = 0;
		for (int lin = 0, col = this.matriz.length - 1;
				lin < this.matriz.length;
				lin++, col--) {			
			int numero = this.matriz[lin][col];
			
			if (this.ehPrimo(numero)) {
				qtdePrimosSecundaria += 1;
			}
		}
		
		
		return qtdePrimosSecundaria;
	}

	private boolean ehPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		
		for (int divisor = 2; 
				divisor < numero; 
				divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}
		
		return true;
	}

	private void lerNumerosPeloTeclado() {
		System.out.println("\nLeitura Matriz\n");
		Scanner ler = new Scanner(System.in);
		
		for (int lin = 0; lin < this.matriz.length; lin++) {
			for (int col = 0; col < this.matriz.length; col++) {
				System.out.printf("Matriz[%d][%d]: ",
						          lin, col);
				this.matriz[lin][col] = ler.nextInt();
			}
		}
		ler.close();
	}

}

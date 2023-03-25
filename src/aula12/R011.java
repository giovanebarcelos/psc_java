package aula12;

import java.util.Scanner;

/*
 * R011 Escreva um programa que leia um valor 
 * inteiro n, calcule e mostre a soma dos n 
 * primeiros números pares. Exemplo: n = 3, 
 * apresentará 2 + 4 + 6 = 12. 
 */

public class R011 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Número: ");
		int numero = ler.nextInt();		
		int soma = 0;
		int par = 2;
		
		while (numero > 0) {
			soma += par;
			par += 2;
			numero--;
		}
		
		System.out.println("Soma dos pares = " +
		                   soma);
		
		

	}

}

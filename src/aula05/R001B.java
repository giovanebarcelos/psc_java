package aula05;

import java.util.Scanner;

/*
 R001 Faça um algoritmo que leia um valor de 
 referência, um número inicial e outro final.
 Informe se o valor de referência encontra-se 
 entre o número inicial e o final digitados.
 */

public class R001B {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Valor Ref: ");
		double valorRef = ler.nextDouble();
		System.out.print("Valor Ini: ");
		double valorIni = ler.nextDouble();
		System.out.print("Valor Fim: ");
		double valorFim = ler.nextDouble();
		
		if (R001B.estaContido( valorRef, 
				valorIni, valorFim )) {
			System.out.printf(
					"O valor %f esta entre %f e %f",
					valorRef, valorIni, valorFim);
		} else {
			System.out.printf(
					"O valor %f não esta entre %f e %f",
					valorRef, valorIni, valorFim);
		}	

	}
	
	public static boolean estaContido(double valorRef, 
			double valorIni, double valorFim) {
		boolean eureka = 
				valorRef >= valorIni &&
				valorRef <= valorFim;
				
		return eureka;
	}
	
}

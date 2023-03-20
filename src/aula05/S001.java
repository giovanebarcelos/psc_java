package aula05;

import java.util.Scanner;

/*
S001 Criar um algoritmo que leia o valor de 
     um produto e imprima na console este valor com
     30% de acréscimo
*/

public class S001 {
	public static void main(String[] args) {
		double valorProduto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Valor Produto: ");
		valorProduto = ler.nextDouble();
		
		double valorProdutoComAcrescimo =
				S001.valorComAcrescimo( 
						valorProduto,
						(float) 1.3);
		
		System.out.printf(
				"Novo Valor = %12.2f", 
				valorProdutoComAcrescimo);
		
		
		ler.close();	
		
	}
	
	public static double valorComAcrescimo(
			double valorProduto, 
			float fator
			) {
		double valorProdutoComAcrescimo =
				valorProduto * fator;
		
		return valorProdutoComAcrescimo;
	}

}

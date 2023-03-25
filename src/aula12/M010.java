package aula12;

import java.util.Scanner;

/*
 * M010 Escreva um algoritmo que permita a leitura dos 
 * nomes de 10 pessoas e armaze os nomes lidos em um vetor.
 * Após isto, o algoritmo deve permitir a leitura de mais 1 
 * nome qualquer de pessoa e depois escrever a mensagem ACHEI,
 * se o nome estiver entre os 10 nomes lidos anteriormente 
 * (guardados no vetor), ou NÃO ACHEI caso contrário. 
 */

public class M010 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		
		pessoas = lerDados(pessoas);
		
		System.out.print("Nome a procurar: ");
		String pessoaProcurar = ler.next();
		
		if (existe(pessoaProcurar, pessoas)) {
			System.out.println("Achei");
		} else {
			System.out.println("Não Achei");		
		}
		
		ler.close();		
	}

	private static boolean existe(String pessoaProcurar, Pessoa[] pessoas) {
		int posicao = pessoas.length - 1;
		while (posicao> -1) {
			if (pessoaProcurar.equals(pessoas[posicao].getNome())) {
				return true;
			}
			posicao--;
		}	
		
		return false;
	}

	private static Pessoa[] lerDados(Pessoa[] pessoas) {
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa(null);
			Pessoa pessoa = pessoas[i];
			
			System.out.printf("%d) Nome: ", i+1);
			pessoa.setNome( ler.next()  );
		}
		//ler.close();		
		return pessoas;
	}

}

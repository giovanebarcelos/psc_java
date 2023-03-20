package aula06;

import java.util.Scanner;

/*
 R003 Você esta fazendo uma pesquisa entre os habitantes 
      de uma pequena vila. Escreva um algoritmo que 
      colete os dados de idade, sexo (M/F) e salário de 
      todos as pessoas que desejam participar da pesquisa 
      (para encerrar a entrada de dados entre a idade menor ou
      igual a zero). Após coletar todos os dados informe:
 a. A média de salário do grupo
 b. Maior e menor idade do grupo
 c. A percentagem do total de mulheres com salário até R$ 300,00
 d. A quantidade de homen
*/

public class R003 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade = Integer.MAX_VALUE, 
			qtdePessoas = 0,
			maiorIdade = Integer.MIN_VALUE, 
			menorIdade = Integer.MAX_VALUE, 
			totalMulheres = 0, 
			totalHomens = 0,
			qtdeMulheresSalMenor300 = 0;
		String sexo;
		double salario, totalSalario = 0;
		
		while (idade > 0) {
			
			System.out.print("Idade: ");
			idade = ler.nextInt();
			System.out.print("Sexo (M/F): ");
			sexo = ler.next();
			System.out.print("Salário: ");
			salario = ler.nextDouble();
			
			if (idade > 0) {
				qtdePessoas = qtdePessoas + 1;
				totalSalario = totalSalario + salario;
				
				if (idade > maiorIdade) {
					maiorIdade = idade;
				}
				if (idade < menorIdade) {
					menorIdade = idade;
				}
				
				if (sexo.compareTo("F") == 0) {
					totalMulheres += 1;
					
					if (salario <= 300) {			
						qtdeMulheresSalMenor300 += 1;
					}
				} else {
					totalHomens += 1;
				}
			}			
		}
		double mediaSalarios = totalSalario / qtdePessoas;
		System.out.printf("Média Salario: %12.2f", 
				          mediaSalarios);
		System.out.printf("\nMenor Idade: %d Maior Idade = %d",
				menorIdade, maiorIdade);
		if (qtdeMulheresSalMenor300 > 0) {
		  System.out.printf("\nPerc Mulheres Sal Menor 300 = %5.2f%%",
				((float) qtdeMulheresSalMenor300/ (float) totalMulheres)*100.0);
		}
		System.out.println("\nTotal Homens = " + 
				totalHomens);
		
		ler.close();
	}

}

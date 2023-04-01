package aula14;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Caloria> menu = new ArrayList<Caloria>();
	private int pratoEscolhido;
	private int bebidaEscolhida;
	private int sobremesaEscolhida;

	public void addItemMenu(Caloria caloria) {
		menu.add(caloria);
	}

	public void escolherMenu() {
		escolherPrato();
		escolherBebida();
		escolherSobremesa();
	}

	private void escolherSobremesa() {
		imprimirMenu("Sobremesa");

	}

	private void escolherBebida() {
		imprimirMenu("Bebida");

	}

	private void escolherPrato() {
		imprimirMenu("Prato");
	}

	private void imprimirMenu(String item) {
		System.out.println(item);
		imprimirOpcoesMenu(item);
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Opção: ");
		int opcao = ler.nextInt();
		
		if ("Prato".equals(item)) {
			this.pratoEscolhido = opcao;
		} else if ("Bebida".equals(item)) {
			this.bebidaEscolhida = opcao;
		} else if ("Sobremesa".equals(item)) {
			this.sobremesaEscolhida = opcao;
		}
	}

	private void imprimirOpcoesMenu(String item) {
		for (int i = 0; i < menu.size(); i++) {
			if (item.equals("Prato") && menu.get(i) instanceof Prato) {
				System.out.printf("%d) %s\n", i + 1, 
						menu.get(i).getDescricao());
			} else if (item.equals("Bebida") && 
					menu.get(i) instanceof Bebida) {
				System.out.printf("%d) %s\n", i + 1, 
						menu.get(i).getDescricao());
			} else if ( item.equals("Sobremesa") &&
					menu.get(i) instanceof Sobremesa) {
				System.out.printf("%d) %s\n", i + 1,
						menu.get(i).getDescricao());
			}
		}
	}

}

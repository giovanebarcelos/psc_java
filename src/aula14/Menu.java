package aula14;

import java.util.ArrayList;

public class Menu {
	ArrayList<Caloria> menu = new ArrayList<Caloria>();
	
	public void addItemMenu(Caloria caloria) {
		menu.add(caloria);
	}

	public void escolherMenu() {
		escolherPrato();
		//escolherBebida();
		//escolherSobremesa();
	}

	private void escolherPrato() {
		imprimirMenu("Prato");
	}

	private void imprimirMenu(String item) {
		for (int i = 0; i < menu.size(); i++) {
			if (item.equals("Prato") && 
					menu.get(i) instanceof Prato ) {
				System.out.printf("%d) %s",
						i+1, menu.get(i).getDescricao());
			} else if (item.equals("Bebida") && 
					menu.get(i) instanceof Bebida) {
				System.out.printf("%d) %s",
						i+1, menu.get(i).getDescricao());
			} else {
				if (item.equals("Sobremesa") && 
						menu.get(i) instanceof Bebida) {
					System.out.printf("%d) %s",
							i+1, menu.get(i).getDescricao());
				}
			}
		}
	}
	
}

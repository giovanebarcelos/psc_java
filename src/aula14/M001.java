package aula14;

/* M001 Faça um algoritmo que informe a quantidade total 
 * de calorias da refeição a partir da escolha do usuário 
 * que deverá informar o prato, a sobremesa e bebida, 
 * conforme tabela abaixo:
 * PRATO              SOBREMESA              BEBIDA
 * Vegetariano 180cal Abacaxi 75cal          Chá 20cal
 * Peixe       230cal Sorvete diet 110cal    Suco de Laranja 70cal
 * Frango      250cal Mousse diet 170cal     Suco melão 100cal
 * Carne       350cal Mouse chocolate 200cal Refrigerante diet 65cal
 */ 

public class M001 {

	public static void main(String[] args) {
		Menu menu = new Menu();
		
		addItensDoMenu(menu);
		
		menu.escolherMenu();

	}

	private static void addItensDoMenu(Menu menu) {
		// Inclusão pratos no Menu
		menu.addItemMenu(new Prato("Vegetariano", 180));
		menu.addItemMenu(new Prato("Peixe", 230));
		menu.addItemMenu(new Prato("Frango", 250));
		menu.addItemMenu(new Prato("Carne", 350));
		
		// Inclusão sobremesa no Menu
		menu.addItemMenu(new Sobremesa("Abacaxi", 75));
		menu.addItemMenu(new Sobremesa("Sorvete diet", 110));
		menu.addItemMenu(new Sobremesa("Mousse diet", 170));
		menu.addItemMenu(new Sobremesa("Mouse chocolate", 200));
		
		// Inclusão bebidas no Menu
		menu.addItemMenu(new Bebida("Chá", 20));
		menu.addItemMenu(new Bebida("Suco de Laranja", 70));
		menu.addItemMenu(new Bebida("Suco melão", 100));
		menu.addItemMenu(new Bebida("Refrigerante diet", 65));
	}

}

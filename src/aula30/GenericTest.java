package aula30;

public class GenericTest {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>();
		
		lista.adicionar("Dick Vigarista");
		lista.adicionar("Penélope Charmosa");
		
		lista.imprimir();
		
		Lista<Integer> lista1 = new Lista<Integer>();
		lista1.adicionar(1);
		lista1.adicionar(2);
		
		lista1.imprimir();
	}

}

package aula30;

import java.util.ArrayList;

public class Lista<T> {

	private ArrayList<T> lista = new ArrayList<T>();

	public void adicionar(T valor) {
		lista.add(valor);
	}

	public void imprimir() {
		for (T item : this.lista) {
			System.out.println(item);
		}		
	}
}

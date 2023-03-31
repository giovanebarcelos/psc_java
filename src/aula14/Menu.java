package aula14;

import java.util.ArrayList;

public class Menu {
	ArrayList<Caloria> menu = new ArrayList<Caloria>();
	
	public void addItemMenu(Caloria caloria) {
		menu.add(caloria);
	}
}

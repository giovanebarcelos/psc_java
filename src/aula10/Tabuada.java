package aula10;

public class Tabuada {

	public static void main(String[] args) {
		int tabuada[][] = new int[10][10];
		
		System.out.println();
		for (int linha = 0; linha < 10; linha++) {			
			if (linha == 0) {
				System.out.print("   X");				
				for (int coluna = 0; coluna < 10; coluna++ ) {
					System.out.printf("%4d", coluna+1);					
				}				
			}
			System.out.println();
			for (int coluna = 0; coluna < 10; coluna++ ) {
				if (coluna == 0) {
					System.out.printf("%4d", linha+1);
				}
				tabuada[linha][coluna] = (linha+1)*(coluna+1);
				System.out.printf("%4d", tabuada[linha][coluna]);
			}			
		}
	}

}

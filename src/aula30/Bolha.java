package aula30;

public class Bolha {

	public static void main(String[] args) {
		int numeros[] = {7,3,9,1,12,2,0,13,10};
		
		numeros = Bolha.ordenar(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");			
		}

	}

	private static int[] ordenar(int[] numeros) {
		int fim = numeros.length;
		
		for (int i = 0; i < fim - 1; i++) {
			for( int j = 0; j < fim - i - 1; j++) {
				if (numeros[j] > numeros[j+1]) {
					// Troca 
					int temp = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = temp;
				}
			}
		}
		
		return numeros;
	}

}

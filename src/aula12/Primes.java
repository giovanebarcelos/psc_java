package aula12;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two thousands.
 */

public class Primes {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int num = 2; num <= 2000; num++) {
			System.out.println("Verificando "+num+" ...");
			if (ehPrimo(num)) {
				sum += num;
			}
		}
		System.out.println("Soma primos menores que 2MI = " + 
				sum);
	}

	private static boolean ehPrimo(int num) {
		int divisor = 2;
		
		while (divisor < num) {
			if (num % divisor == 0) {
				return false;
			}
			divisor++;
		}
		
		return true;
	}

}

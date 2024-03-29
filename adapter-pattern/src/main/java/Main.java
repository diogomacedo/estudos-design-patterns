/**
 * Classe Cliente
 */

public class Main {

	public static void main(String[] args) {

		IConversor conversorDolar = new ConversorDolar(10, 2, 5);
		conversorDolar.converter();

		IConversor conversorEuro = new EuroAdapter(10, 2, 5.5);
		conversorEuro.converter();

	}

}

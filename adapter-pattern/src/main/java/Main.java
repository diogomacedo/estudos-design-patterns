
public class Main {

	public static void main(String[] args) {

		ConversorDolar conversorDolar = new ConversorDolar(10, 2);
		conversorDolar.calcular();

		EuroAdapter conversorEuro = new EuroAdapter(8, 2);
		conversorEuro.calcular();

	}

}

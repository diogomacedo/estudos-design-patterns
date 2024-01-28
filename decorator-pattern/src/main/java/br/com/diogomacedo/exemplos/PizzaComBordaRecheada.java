package br.com.diogomacedo.exemplos;

public class PizzaComBordaRecheada extends PizzaEspecial {

	PizzaComBordaRecheada(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double preco() {
		double preco = 5;
		System.out.println("Adicionando borda recheada");
		System.out.println("");
		System.out.println("Valor inicial da pizza: R$" + super.pizzaEspecial.preco());
		System.out.println("");
		System.out.println("Valor da borda recheada: R$" + preco);
		preco += super.pizzaEspecial.preco();
		System.out.println("Valor parcial da pizza: R$" + preco);
		return preco;
	}

}

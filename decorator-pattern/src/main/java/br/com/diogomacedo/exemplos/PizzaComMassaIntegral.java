package br.com.diogomacedo.exemplos;

public class PizzaComMassaIntegral extends PizzaEspecial {

	PizzaComMassaIntegral(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double preco() {
		double preco = 5;
		System.out.println("Mudando a massa para integral");
		System.out.println("");
		System.out.println("Valor inicial da pizza: R$" + super.pizzaEspecial.preco());
		System.out.println("");
		System.out.println("Valor da massa integral: R$" + preco);
		preco += super.pizzaEspecial.preco();
		System.out.println("Valor parcial da pizza: R$" + preco);

		return preco;
	}

}

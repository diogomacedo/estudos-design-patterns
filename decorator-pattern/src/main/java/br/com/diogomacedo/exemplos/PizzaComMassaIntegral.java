package br.com.diogomacedo.exemplos;

public class PizzaComMassaIntegral extends PizzaEspecial {

	PizzaComMassaIntegral(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double preco() {
		return super.pizzaEspecial.preco() + 5;
	}

}

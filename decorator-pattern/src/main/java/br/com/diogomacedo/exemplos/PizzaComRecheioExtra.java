package br.com.diogomacedo.exemplos;

public class PizzaComRecheioExtra extends PizzaEspecial {

	PizzaComRecheioExtra(Pizza pizza) {
		super(pizza);
	}

	@Override
	public double preco() {
		return super.pizzaEspecial.preco() + ( super.pizzaEspecial.preco() * 0.5 );
	}

}

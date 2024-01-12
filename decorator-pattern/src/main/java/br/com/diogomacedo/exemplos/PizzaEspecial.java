package br.com.diogomacedo.exemplos;

public abstract class PizzaEspecial implements Pizza {

	Pizza pizzaEspecial;

	PizzaEspecial(Pizza pizza) {
		this.pizzaEspecial = pizza;
	}

}
